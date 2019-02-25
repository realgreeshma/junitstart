
package com.pradyash.basicjava;

public class ColorString
{
	public static void main(String [] args)
	{
		seeColor("Reddy");
		seeColor("blueflames");
		seeColor("Tomato");
		}
	
	public static void seeColor(String givenString)
	{
		if (givenString.length()>= 3 && givenString.substring(0, 3).equalsIgnoreCase("red"))
		{
			System.out.println("Red");	
		}
		else if(givenString.length()>=4 && givenString.substring(0, 4).equalsIgnoreCase("blue"))
		{
			System.out.println("Blue");			
		}else 
		{
			System.out.println(" ");
		}
	}
	// The code without builtin methods
	
	public static String makeSubString(String myString , int startIndex,int lastIndex) 
	{
		String newString = " ";
		
		if ((startIndex >= 0) && (startIndex < lastIndex) && (startIndex <= myString.length()))
		{
			for (int  i = startIndex ; i<= lastIndex ; i++)
			{
				newString += newString.charAt(i);
			}
			return newString;
		}
		else 
		return "Enter valid Indexes " ;
		
	}
	}