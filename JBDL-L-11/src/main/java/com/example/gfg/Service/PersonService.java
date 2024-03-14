package com.example.gfg.Service;

import com.example.gfg.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    static List<Person> list = new ArrayList<>();
    static {
       list.add(new Person(1,"Robin", "rob@gmail.com"));
       list.add(new Person(2, "sahil", "sahil@gmail.com"));
    }

    public List<Person> getPerson(){
        return list;
    }

    public Person getPersonById(int id){
        for (Person p: list){
            if (p.getId()==id){
                return p;
            }
        }

        return null;
    }
}
