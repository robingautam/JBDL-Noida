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

    Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;

    @RequestMapping("/getPersons")
    public List<Person> getPersons(){
        List<Person> ans = personService.getPerson();
        LOGGER.info("This is Info message");
        LOGGER.warn("This is warn Message");
        LOGGER.error("This is error Message");
        LOGGER.debug("This is Debug message");
        LOGGER.trace("This is Trace Message");
        return ans;
    }

    @RequestMapping("/person/get/{id}")
    public Person getPersonById(@PathVariable("id") String id){
        int nid = Integer.parseInt(id);
        return personService.getPersonById(nid);
    }

    @PostMapping("/create/person")
    public ResponseEntity<Object> createPerson(@RequestBody(required = false)  Person p){
        System.out.println(p);
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }

    @RequestMapping("/headers")
    public String headers(@RequestHeader HttpHeaders headers){
         for (String key: headers.keySet()){
             System.out.println(key+ ": "+headers.get(key));
         }
        return "checking";
    }
}
