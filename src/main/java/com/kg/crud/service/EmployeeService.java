package com.kg.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kg.crud.model.Employee;
import com.kg.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public String deleteEmployee(int id) {
        employeeRepository.delete(id);
        return "product removed !! " + id;
    }

    public Employee updateEmployee(Employee employee) {
       return employeeRepository.update(employee);
    }
}
