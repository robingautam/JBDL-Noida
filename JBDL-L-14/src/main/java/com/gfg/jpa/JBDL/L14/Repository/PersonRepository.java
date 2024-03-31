package com.gfg.jpa.JBDL.L14.Repository;

import com.gfg.jpa.JBDL.L14.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    public Person findById(int id);
    public Person findByEmail(String email);

    public Person findByNameLike(String name);

    @Query(value = "select u from Person u where u.name=:p"
    , nativeQuery = true)
    public Person findByNameUsingJPQL(@Param("p") String name);

}
