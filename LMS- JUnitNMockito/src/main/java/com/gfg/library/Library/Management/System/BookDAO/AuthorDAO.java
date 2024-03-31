package com.gfg.library.Library.Management.System.BookDAO;

import com.gfg.library.Library.Management.System.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AuthorDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

  /*  public int findAuthorById(String id){
        String query = "SELECT AUTHOR_ID FROM author WHERE AUTHOR_EMAIL="+id;
        int res = jdbcTemplate.query(query, );
        return res;
    }*/

    public int createAuthor(Author author){
        String query = "INSERT INTO author (AUTHOR_NAME, AUTHOR_EMAIL, AUTHOR_PHONE) VALUES (?,?,?)";
        int row = jdbcTemplate.update(query,author.getAuthorName(),author.getAuthorEmail(),author.getPhoneNo());
        return row;
    }
}
