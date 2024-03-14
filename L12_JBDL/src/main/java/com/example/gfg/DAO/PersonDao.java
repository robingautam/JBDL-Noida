package com.example.gfg.DAO;

import com.example.gfg.Model.Person;

public interface PersonDao {

    public int create(Person p);
    public Person fetchById(int id);

    public boolean deleteById(int id);
}
