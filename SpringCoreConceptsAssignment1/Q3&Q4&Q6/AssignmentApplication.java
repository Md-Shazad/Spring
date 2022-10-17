package com.shazad.assignment.assignment;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
			//////loose coupling///////
		/*Calculator  op = new Calculator(new Addition());
		//or we can send new Subtraction() in the Calculator's constructor
		System.out.println(op.callAddResult(77, 80));
		//System.out.println(sub.callSubtractResult(55, 34));*/
		
		
		ApplicationContext applicationContext = SpringApplication.run(AssignmentApplication.class, args);
		Calculator calc = applicationContext.getBean(Calculator.class);
		System.out.println(calc.callAddResult(5, 6));
	}

}
