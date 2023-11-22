package com.bootcamp.dayone.exercise_five;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
