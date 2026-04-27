package com.company.demo.service;

import com.company.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Ravi", "DevOps Engineer"),
                new Employee(2, "Priya", "Java Developer"),
                new Employee(3, "Arjun", "QA Engineer")
        );
    }
}
