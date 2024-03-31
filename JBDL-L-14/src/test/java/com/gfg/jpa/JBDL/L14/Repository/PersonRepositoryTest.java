package com.gfg.jpa.JBDL.L14.Repository;

import com.gfg.jpa.JBDL.L14.Model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    // To save the Data
    @Test
    public void savePerson(){
        Person p = new Person();
        p.setId(2);
        p.setName("Dagar");
        p.setEmail("dagar@gmail.com");

        personRepository.save(p);
        System.out.println("data has been saved");
    }
    // fetching the data
    @Test
    public void fetchPersondData(){
        int id = 1;
        List<Person> list = personRepository.findAll();

        for (Person p: list){
            System.out.println(p);
        }
    }
    // Updating the data
    @Test
    public void updatePersonData(){
        int id = 2;
        Person p = personRepository.findById(1);
        p.setName("Sagar");
        p.setEmail("sagar@gmail.com");
        personRepository.save(p);
        System.out.println("data has been updated");

    }
    // deleting the data
    @Test
    public void deleteData(){
        int id = 2;
        Person p = personRepository.findById(id);
        personRepository.delete(p);
        System.out.println("Person has been deleted");
    }

    @Test
    public void getBYEmailId(){
        String email = "sagar@gmail.com";
        Person person = personRepository.findByEmail(email);
        if (person==null){
            System.out.println("Data Not Found");
        }else {
            System.out.println(person);
        }
    }

    @Test
    public void getByLikeOperator(){
        String st = "%sa%";
        Person p = personRepository.findByNameLike(st);
        if (p==null){
            System.out.println("data Not found");
        }else {
            System.out.println(p);
        }
    }

    @Test
    public void getBYJPQLQuery(){
        Person p = personRepository.findByNameUsingJPQL("sagar");
        if (p==null){
            System.out.println("data Not found");
        }else {
            System.out.println(p);
        }
    }


}