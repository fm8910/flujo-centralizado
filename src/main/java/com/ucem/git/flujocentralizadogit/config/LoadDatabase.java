package com.ucem.git.flujocentralizadogit.config;

import com.ucem.git.flujocentralizadogit.entity.Employee;
import com.ucem.git.flujocentralizadogit.repository.EmployeeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            repository.save(new Employee("Bilbo Baggins", "burglar"));
            repository.save(new Employee("Frodo Baggins", "thief"));
        };
    }
}