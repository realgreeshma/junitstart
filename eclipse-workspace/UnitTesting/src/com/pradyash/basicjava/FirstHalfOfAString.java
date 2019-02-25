package com.pradyash.basicjava;

public class FirstHalfOfAString {
public static void main(String[] args) {
	String myString = "woohoo";
	System.out.println(myString.length());
System.out.println( firstHalf("abcdef"));
}
	
	  public static String firstHalf(String givenString) {
		  String newString = " ";
	  for(int i=0;i<givenString.length()/2;i++)
	  {
		  newString += givenString.charAt(i);
	  }  
	  return newString;
	  }
	 
}
