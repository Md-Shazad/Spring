package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined;

import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Entity.BankCheck;
import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Entity.Card;
import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Repository.PaymentsRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Runner.class)
class JpaSession2JoinedApplicationTests
{
	@Autowired
	PaymentsRepository paymentsRepository;

	@Test
	void contextLoads()
	{
	}

	@Test
	public void createCardPayments()
	{
		Card cardPayment = new Card();
		cardPayment.setId(1);
		cardPayment.setAmount(13000);
		cardPayment.setCardnumber("30786");
		paymentsRepository.save(cardPayment);
	}

	@Test
	public void createCheckPayments()
	{
		BankCheck bankCheckPayment = new BankCheck();
		bankCheckPayment.setId(2);
		bankCheckPayment.setAmount(14000);
		bankCheckPayment.setChecknumber("48956");

		paymentsRepository.save(bankCheckPayment);
	}
}
