package com.ucem.git.flujocentralizadogit.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name=name;
        this.role=role;
    }

    public Employee(){

    }
}
