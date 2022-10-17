package com.shazad.assignment.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator { //bean
	
	private ArithmeticOperations arithmeticOperations; // dependency
	/*
	public Calculator(ArithmeticOperations arithmeticOperations){
		super();
		this.arithmeticOpertations = arithmeticOperations;
	}*/
	@Autowired
	public void arithmeticOperations(ArithmeticOperations arithmeticOperations) {
		this.arithmeticOperations = arithmeticOperations;
	}
	
	public int callAddResult(int a, int b) {
		return arithmeticOperations.result(a,b);
	}
	public int callSubtractResult(int a, int b) {
		return arithmeticOperations.result(a,b);
	}
	
}
