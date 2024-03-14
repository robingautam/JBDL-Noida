package org.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Box2 {
    int id;
    Box2(){}

    @PostConstruct
    public void init(){
        System.out.println("initialising fields");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Cleanup Code");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "id=" + id +
                '}';
    }
}
