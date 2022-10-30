package com.jpa.assignment.jpaassignment;

import com.jpa.assignment.jpaassignment.entities.Employee;
import com.jpa.assignment.jpaassignment.repositories.EmployeeRepository;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
//@ContextConfiguration({"classpath*:spring/applicationContext.xml"})
@SpringBootTest
public class JpaAssignmentApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}



	@Test
	public void testCreate(){
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirst_name("raj");
		emp.setAge(20);
		emp.setLocation("aas paas ghar");
		employeeRepository.save(emp);
	}

	@Test
	public void testRead(){
		Employee emp= employeeRepository.findById(1).get();
		assertNotNull(emp);
		assertEquals("raj",emp.getFirst_name());
	}

	@Test
	public void testUpdate(){
		Employee emp = employeeRepository.findById(1).get();
		emp.setAge(28);
		employeeRepository.save(emp);
	}

	@Test
	public void testDelete(){
		if(employeeRepository.existsById(1))
			employeeRepository.deleteById(1);
	}

	@Test
	public void testCount(){
		System.out.println(employeeRepository.count());
	}

	@Test
	public void testFindByName(){
		List<Employee> emp = employeeRepository.findByName("bb");
		emp.forEach(e-> System.out.println(e.getAge()));
	}

	@Test
	public void testFindByNameLike(){
		List<Employee> emp = employeeRepository.findByNameLike("A%");
		emp.forEach((e-> System.out.println(e.getFirst_name())));
	}

	@Test
	public void testFindByAgeIsBetween(){
		List<Employee> emp = employeeRepository.findByAgeIsBetween(28,32);
		emp.forEach((e-> System.out.println(e.getFirst_name())));
	}

	@Test
	public void testFindAll() {
		Pageable pageable= PageRequest.of(0,4, Sort.by("age"));
		employeeRepository.findAll(pageable).forEach(e-> System.out.println(e.getFirst_name()+" "+ e.getAge()));
	}
}
