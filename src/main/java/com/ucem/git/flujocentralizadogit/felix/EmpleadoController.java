package com.ucem.git.flujocentralizadogit.felix;

import com.ucem.git.flujocentralizadogit.entity.Employee;
import com.ucem.git.flujocentralizadogit.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {

    private final EmployeeRepository repository;

    public EmpleadoController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return (List<Employee>) repository.findAll();
    }
}
