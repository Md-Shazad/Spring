package com.shazad.assignment.assignment;

import org.springframework.stereotype.Component;

@Component
public class Addition implements ArithmeticOperations{//bean
	//since no dependency therefore no @Autowired annotation used
		public int result(int a, int b) {
			return a+b;
		}
}
