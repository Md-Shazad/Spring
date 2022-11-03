package com.ttn.jpa.assignment2.jpaassignment2.ComponentMapping;


import com.ttn.jpa.assignment2.jpaassignment2.ComponentMapping.Entity.Address;
import com.ttn.jpa.assignment2.jpaassignment2.ComponentMapping.Entity.Employees;
import com.ttn.jpa.assignment2.jpaassignment2.ComponentMapping.Repository.EmployeesRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Runner.class)
class JpaSession2ComponentApplicationTests
{
	@Autowired
	EmployeesRepository employeesRepository;

	@Test
	void contextLoads()
	{
	}

	@Test
	public void createEmployee()
	{
		Employees employees = new Employees();
		employees.setId(1);
		employees.setName("Md");

		Address address = new Address();
		address.setCity("patna");
		address.setCountry("India");
		address.setState("Bihar");
		address.setZipcode("800008");
		address.setStreetaddress("Khajekalan");

		employees.setAddress(address);
		employeesRepository.save(employees);
	}
}
