package com.ttn.jpa.assignment2.jpaassignment2.Jpql;


import com.ttn.jpa.assignment2.jpaassignment2.Jpql.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpaSession2JPQLApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads()
	{
	}


	@Test
	public void testListFindByEmpSalaryGreaterThanAvgSalary()
	{
		List<Object[]> list = employeeRepository.findByEmpSalaryGreaterThanAvgSalary();
		for(Object[] emp : list)
		{
			System.out.println(emp[0] + " "+ emp[1]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdateSalaryLessThanAvgSalary()
	{
		int avgSal=employeeRepository.avgSal();
	 	int sal=28000;
		employeeRepository.updateSalaryLessThanAvgSalary(sal,avgSal);
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testDeleteMinSalaryEmployee()
	{
		employeeRepository.DeleteMinSalaryEmployee(25000);
	}
}
