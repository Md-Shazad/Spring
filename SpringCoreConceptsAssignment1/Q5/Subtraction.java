package com.shazad.assignment.assignment;

import org.springframework.stereotype.Component;

@Component
public class Subtraction implements ArithmeticOperations{
		public int result(int a, int b) {
			return a-b;
		}
}
