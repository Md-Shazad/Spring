package com.jpa.assignment.jpaassignment.repositories;

import com.jpa.assignment.jpaassignment.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>, PagingAndSortingRepository<Employee,Integer> {
    Page<Employee> findAll(Pageable pageable);
    @Override
    Optional<Employee> findById(Integer id);
    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String pat);
    List<Employee> findByAgeIsBetween(int a, int b);
}
