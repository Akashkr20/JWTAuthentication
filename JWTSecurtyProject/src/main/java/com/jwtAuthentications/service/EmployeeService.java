package com.jwtAuthentications.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jwtAuthentications.model.Employee;
import com.jwtAuthentications.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }


}


