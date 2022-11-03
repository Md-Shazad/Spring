package com.ttn.jpa.assignment2.jpaassignment2.ComponentMapping.Repository;


import com.ttn.jpa.assignment2.jpaassignment2.ComponentMapping.Entity.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees,Integer>
{

}
