package com.ttn.jpa.assignment2.jpaassignment2.NativeSql;



import com.ttn.jpa.assignment2.jpaassignment2.NativeSql.Repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaSession2NativeSqlApplicationTests
{

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads()
	{
	}

	@Test
	public void testFindByLastNameEnds()
	{
		List<Object[]> empList = employeeRepository.findByLastNameEnds();
		for (Object[] obj : empList)
		{
			System.out.println(obj[0] + " " + obj[1] + " " + obj[2]);
		}
	}

	@Test
	@Transactional()
	@Rollback(value = false)
	public void testDeleteEmpWithAgeGreat()
	{
		employeeRepository.deleteEmpWithAgeGreat(48);
	}

}
