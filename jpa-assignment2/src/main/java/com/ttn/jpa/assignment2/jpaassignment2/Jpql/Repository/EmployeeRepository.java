package com.ttn.jpa.assignment2.jpaassignment2.Jpql.Repository;


import com.ttn.jpa.assignment2.jpaassignment2.Jpql.Entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
    //Display the first name, last name of all employees having
    // salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Query(value="select firstName,lastName from Employee where salary > (select avg(salary) from Employee) ORDER BY age ASC,salary DESC")
    List<Object[]> findByEmpSalaryGreaterThanAvgSalary();

    @Query(value = "select AVG(salary) from Employee")
    Optional<Integer> avgSalary();

    @Modifying
    @Query(value = "UPDATE Employee SET salary =:salary WHERE salary <:avgSalary")
    void  updateSalaryLessThanAvgSalary(@Param("salary") int salary, @Param("avgSalary") int avgSalary);

    @Query(value="select avg(salary) from Employee")
    int avgSal();

    @Query(value="select salary from Employee where salary <:minSalary")
    void DeleteMinSalaryEmployee(@Param("minSalary") int minSalary);


}
