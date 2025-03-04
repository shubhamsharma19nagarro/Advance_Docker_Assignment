package com.employee.services.impl;

import com.employee.entity.Employee;
import com.employee.repositories.EmployeeRepository;
import com.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

//    @Cacheable(value = "employees", key = "#employeeId")
    public Employee getEmployeeById(String employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("No employee find by provide id : " + employeeId));
    }

//    @CachePut(value = "employees", key = "#employee.id")
    public Employee saveEmployee(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}
