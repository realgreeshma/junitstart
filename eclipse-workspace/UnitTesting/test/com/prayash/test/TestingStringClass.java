package com.prayash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class TestingStringClass {
	
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Some things which are commom to all tests like connecting to database");
	}

	@AfterAll
	static void afterAll()
	{
		System.out.println("runs after all tests,Some things which are commom to all tests like dis-connecting to database");
	}
	
	
	@BeforeEach
	//void beforeEachTest() { ---without a parameter
		void beforeEachTest(TestInfo info) {
		System.out.println("Before each test  " + info.getDisplayName());
	}
	

	@Test
	void split_method_test() {
		String str = "Pra,Gree,Pra,Yas";
		String sActual[] = str.split(",");
		assertArrayEquals(new String[] { "Pra", "Gree", "Pra", "Yas" }, sActual);
	}
	
	@Test 
	void testingExceptionCase()
	{
		String x= null;
		//nullpointerexception
		//int actualLength = x.length();
		
	assertThrows(NullPointerException.class, 
			()->{
				int actualLength = x.length();
				}
			);
	}

	@Test
	void math_max_test() {
		assertEquals(101, Math.max(101, 21));
	}
	
	@AfterEach
	void AfterEachTest() {
		System.out.println("After each test");
	}
}
