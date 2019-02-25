package com.pradyash.basicjava;

public class RemoveCharFromString {
	
	public static void main(String[] args) 
	{
		withoutX("HelloX");
		withoutX("xHelloX");
		withoutX("xHi");
	}
	
	public static void withoutX(String myString)
	{
		boolean xAtStart = myString.substring(0, 1).equalsIgnoreCase("x");
		boolean xAtEnd =(myString.charAt(myString.length()-1) == 'x') || (myString.charAt(myString.length()-1) == 'X') ;
		if (xAtStart && xAtEnd )
		{
			System.out.println(myString.substring(1,myString.length()-1));
		}
		else if(xAtStart)
		{
			System.out.println(myString.substring(1,myString.length()));
		}
		else if(xAtEnd)
		{
			System.out.println(myString.substring(0, myString.length()-1));
		}
		else 
		{
			System.out.println(myString);
		}
	}
}
