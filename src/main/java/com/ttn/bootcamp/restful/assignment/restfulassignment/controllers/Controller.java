package com.ttn.bootcamp.restful.assignment.restfulassignment.controllers;

import com.ttn.bootcamp.restful.assignment.restfulassignment.entities.Employee;
import com.ttn.bootcamp.restful.assignment.restfulassignment.exceptions.EmployeeNotFoundException;
import com.ttn.bootcamp.restful.assignment.restfulassignment.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/home")
    public String home(){
        return "Welcome to spring boot";
    }

    @GetMapping("/employees")
    public List<Employee> employees(){
        return  employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee oneEmployee(@PathVariable int id){
        if(employeeService.getEmployee(id)==null){
            throw new EmployeeNotFoundException("id not found");//throwing custom exception if id not found
        }
        return employeeService.getEmployee(id); //to get the employee which matches id
    }

    @PostMapping("/employees")
    public void addEmployee(@Valid @RequestBody Employee employee){
         employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
