package com.shazad.assignment.assignment;

public class Calculator {
	
	
	//the two classes Addition and subtraction are tightly coupled  with
	//Calculator class as their object is directly being created from here
	
	public int callAddResult(int a, int b) {
		Addition add = new Addition();
		return add.result(a,b);
	}
	public int callSubtractResult(int a, int b) {
		Subtraction sub = new Subtraction();
		return sub.result(a,b);
	}
	
}
