package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingSINGLE;

import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingSINGLE.Entity.Check;
import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingSINGLE.Entity.CreditCard;
import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingSINGLE.Repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Runner.class)
public class JpaSession2SingleApplicationTests
{
	@Autowired
	PaymentRepository paymentRepository;
	@Test
	void contextLoads()
	{

	}

	@Test
	public void createPayment()
	{
		CreditCard cardPayment = new CreditCard();
		cardPayment.setId(1);
		cardPayment.setAmount(2000);
		cardPayment.setCardnumber("23456");
		paymentRepository.save(cardPayment);

		Check checkPayment = new Check();
		checkPayment.setId(2);
		checkPayment.setAmount(2500);
		checkPayment.setChecknumber("78910");
		paymentRepository.save(checkPayment);
	}
}
