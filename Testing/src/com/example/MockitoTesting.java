package com.example;

import org.mockito.Mockito;

public class MockitoTesting {
	CalculatorService cserv=Mockito.mock(CalculatorService.class);
Calculator c=new Calculator(cserv);
assertEquals(23,c)
}
