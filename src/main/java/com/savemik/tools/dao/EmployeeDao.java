package com.savemik.tools.dao;

import com.savemik.tools.entities.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeDao {
    final EmployeeRepository repository;

    public EmployeeDao(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Bean
    public List<Employee> getAllEmployees () {
        return repository.findAll();
    }
}
