package com.shazad.assignment.assignment;

public class Calculator {
	private ArithmeticOperations arithOp;

	public Calculator(ArithmeticOperations arithOp){
		super();
		this.arithOp = arithOp;
	}
	
	public int callAddResult(int a, int b) {
		return arithOp.result(a,b);
	}
	public int callSubtractResult(int a, int b) {
		return arithOp.result(a,b);
	}
	
}
