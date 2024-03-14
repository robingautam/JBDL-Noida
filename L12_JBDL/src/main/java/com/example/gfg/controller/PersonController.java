package com.example.gfg.controller;

import com.example.gfg.Model.Person;
import com.example.gfg.Service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {


    @Autowired
    PersonService personService;

    @RequestMapping("/getPersons")
    public List<Person> getPersons(){
        List<Person> ans = personService.getPerson();
        return ans;
    }

    @RequestMapping("/person/get/{id}")
    public ResponseEntity<Object> getPersonById(@PathVariable("id") String id){
        int nid = Integer.parseInt(id);
        Person person =  personService.getPersonById(nid);
        if (person==null){
            return new ResponseEntity<>("Not Found",HttpStatus.OK);
        }
        return new ResponseEntity<>(person,HttpStatus.FOUND);
    }

    @PostMapping("/create/person")
    public ResponseEntity<Object> createPerson(@RequestBody(required = false)  Person p){
        System.out.println(p);
        boolean bool = personService.createPerson(p);
        if (bool){
            return new ResponseEntity<>(p,HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Not Created",HttpStatus.BAD_REQUEST);
    }

    @RequestMapping("/headers")
    public String headers(@RequestHeader HttpHeaders headers){
         for (String key: headers.keySet()){
             System.out.println(key+ ": "+headers.get(key));
         }
        return "checking";
    }

    @RequestMapping("/delete/person/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable("id") String id){
        int nid = Integer.parseInt(id);
        boolean bool = this.personService.deleteById(nid);
        if (!bool){
            return new ResponseEntity<>("Not Deleted",HttpStatus.OK);
        }
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }


    
}
