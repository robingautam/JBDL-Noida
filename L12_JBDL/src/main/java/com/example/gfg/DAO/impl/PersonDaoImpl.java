package com.example.gfg.DAO.impl;

import com.example.gfg.DAO.PersonDao;
import com.example.gfg.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Person p) {
        String query = "INSERT INTO Person(id,name,email) VALUES (?,?,?)";
        int result = this.jdbcTemplate.update(query,p.getId(),p.getName(),p.getEmail());
        return result;
    }

    @Override
    public Person fetchById(int id) {
        String query = "select * from person where id=?";
        RowMapper<Person> rmp = new RowMapperImpl();
        Person p = this.jdbcTemplate.queryForObject(query,rmp,id);
        return p;
    }

    @Override
    public boolean deleteById(int id) {
        String query = "DELETE FROM person WHERE id=?";
        int res = this.jdbcTemplate.update(query,id);
        if (res!=0){
            return false;
        }
        return true;
    }
}
