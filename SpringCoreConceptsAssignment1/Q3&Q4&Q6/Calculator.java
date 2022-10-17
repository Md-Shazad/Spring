package com.shazad.assignment.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator { //bean
	@Autowired
	private ArithmeticOperations arithmeticOpertations; // dependency

	public Calculator(ArithmeticOperations arithmeticOperations){
		super();
		this.arithmeticOpertations = arithmeticOperations;
	}
	
	public int callAddResult(int a, int b) {
		return arithmeticOpertations.result(a,b);
	}
	public int callSubtractResult(int a, int b) {
		return arithmeticOpertations.result(a,b);
	}
	
}
