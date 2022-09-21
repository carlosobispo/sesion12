package com.furazin.projecttestgithub.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.furazin.projecttestgithub.Math.Arithmetic;

public class ArithmeticTest {

	@BeforeAll
	static void setup(){
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis(){
		System.out.println("@BeforeEach executed");
	}
	
	
	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach - executed after each test method.");
	}

	@AfterAll
	static void done() {
		System.out.println("@AfterAll - executed after all test methods.");
	}
	
	
	@Test
	@Tag("return result add")
	public void addTest() {
		Arithmetic arith = new Arithmetic(2,3);
		

		assertEquals(arith.add(),5,"result 5");


		arith = new Arithmetic(5,3);
		assertEquals(arith.add(),8);
	}

	@Test
	public void subTest() {
		Arithmetic arith = new Arithmetic(2,3);
		assertEquals(arith.sub(),-1);
	}

	@Test
	public void mulTest() {
		Arithmetic arith = new Arithmetic(2,3);
		assertEquals(arith.mul(),6);
	}

	@Test
	public void divTest() {
		Arithmetic arith = new Arithmetic(4,2);
		assertEquals(arith.div(),2);
	}
	

	
}
