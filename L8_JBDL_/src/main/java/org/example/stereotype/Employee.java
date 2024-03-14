package org.example.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
public class Employee {

    @Value("12")
    String id;
    @Value("Robin")
    String name;
    @Value("#{taskList}")
    List<String> tasks;
    Employee(){}

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
