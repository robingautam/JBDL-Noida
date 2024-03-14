package com.example.gfg.Service;

import com.example.gfg.DAO.impl.PersonDaoImpl;
import com.example.gfg.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDaoImpl personDao;

    static List<Person> list = new ArrayList<>();
    public List<Person> getPerson(){
        return list;
    }

    public Person getPersonById(int id){
        return this.personDao.fetchById(id);
    }

    public boolean createPerson(Person p){
        int res = this.personDao.create(p);
        if (res!=0){
            return true;
        }else {
           return  false;
        }
    }

    public boolean deleteById(int id){
        return this.personDao.deleteById(id);
    }
}
