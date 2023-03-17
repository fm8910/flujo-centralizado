package com.ucem.git.flujocentralizadogit.repository;

import com.ucem.git.flujocentralizadogit.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
