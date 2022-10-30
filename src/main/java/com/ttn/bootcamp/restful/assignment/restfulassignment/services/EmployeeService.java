package com.ttn.bootcamp.restful.assignment.restfulassignment.services;

import com.ttn.bootcamp.restful.assignment.restfulassignment.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee getEmployee(int id);
    void addEmployee(Employee employee);
    void deleteEmployee(int id);

}

