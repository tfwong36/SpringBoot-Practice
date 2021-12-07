package com.tatp.restapi;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) throws NoEmployeeFoundException {
        return employeeRepository.findById(id);
    }

//    @GetMapping(params = {"gender"})
//    public List<Employee> getEmployeesByGender(@RequestParam String gender){
//        return
//    }

//    @GetMapping(params = {"page", "pageSize"})
//    public List<Employee> getEmployees
}
