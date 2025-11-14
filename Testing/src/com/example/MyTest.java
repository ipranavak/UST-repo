package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
public class MyTest {
Calc c=new Calc();
@Before
public void beforeTest1() {
	System.out.println("Task before test1()");
}
@Test
public void test1() {
	assertEquals(25,c.add(13,12));
}
@After
public void afterTest1() {
	System.out.println("Task before test2()");
}
@Test
public void test2() {
	assertEquals(27,c.cube(3));
	
}
}
