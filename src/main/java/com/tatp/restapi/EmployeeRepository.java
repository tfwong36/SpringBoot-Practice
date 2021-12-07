package com.tatp.restapi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeRepository(){
        employees.add(new Employee("1", "Jason", 18, "male", 5));
    }

    public List<Employee> findAll(){
        return employees;
    }
    public Employee findById(Integer id) throws NoEmployeeFoundException {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id.toString()))
                .findFirst()
                .orElseThrow(NoEmployeeFoundException::new);
    }
}
