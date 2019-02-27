package com.prayash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
		 x.length();
				}
			);
	}
	
	@Test
	void tesing_same_parameters()
	{
		assertTrue("Gree".length()>0);
		assertTrue("Pra".length()>0);
		assertTrue("Greeprady".length()>0);
		assertTrue("yash".length()>0);
		assertTrue("Ge".length()>0);
		assertTrue("G".length()>0);
	}

	@ParameterizedTest
	@ValueSource(strings = {"Gree","Vandana","sudhakar"})
	void tesing_same_parameters_repeatedly(String str)
	{
		assertTrue(str.length()>0);	
	}
	
	@Test
	@DisplayName("Testing Math.max test")
	void math_max_test() {
		assertEquals(101, Math.max(101, 21));
	}
	
	@AfterEach
	void AfterEachTest() {
		System.out.println("After each test");
	}
}
