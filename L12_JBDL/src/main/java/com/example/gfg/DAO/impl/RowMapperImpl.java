package com.example.gfg.DAO.impl;

import com.example.gfg.Model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person p = new Person();
        p.setId(rs.getInt(1));
        p.setName(rs.getString(2));
        p.setEmail(rs.getString(3));

        return p;
    }
}
