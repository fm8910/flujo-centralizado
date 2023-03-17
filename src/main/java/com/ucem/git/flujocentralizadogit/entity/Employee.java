package com.ucem.git.flujocentralizadogit.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    public Employee(String bilbo_baggins, String burglar) {
    }

    public Employee(){

    }
}
