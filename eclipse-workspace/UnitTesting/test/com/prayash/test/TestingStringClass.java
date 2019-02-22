package com.prayash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingStringClass {

	@Test
		void split_method_test()
		{
			String str = "Pra,Gree,Pra,Yas";
			String sActual[] = str.split(",");	
			assertArrayEquals(new String[] {"Pra","Gree","Pra","Yas"},sActual);
			
		}
	}
