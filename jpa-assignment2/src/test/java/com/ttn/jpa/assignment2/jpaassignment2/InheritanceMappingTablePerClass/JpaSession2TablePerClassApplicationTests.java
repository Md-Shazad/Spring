package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass;

import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Entity.Check;
import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Entity.CreditCard;
import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaSession2TablePerClassApplicationTests
{
	@Autowired
	PaymentRepository paymentRepository;
	@Test
	void contextLoads()
	{
	}

	@Test
	public void createPaymentCheck()
	{
		Check checkPayment = new Check();
		checkPayment.setId(1);
		checkPayment.setAmount(19000);
		checkPayment.setChecknumber("13580");
		paymentRepository.save(checkPayment);
	}

	@Test
	public void createPaymentCreditCard()
	{
		CreditCard creditCardPayment = new CreditCard();
		creditCardPayment.setId(1);
		creditCardPayment.setAmount(18000);
		creditCardPayment.setCardnumber("18880");
		paymentRepository.save(creditCardPayment);

	}

}
