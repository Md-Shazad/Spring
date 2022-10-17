package com.shazad.assignment.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Addition implements ArithmeticOperations{//bean
	//since no dependency therefore no @Autowired annotation used
		public int result(int a, int b) {
			return a+b;
		}
}
