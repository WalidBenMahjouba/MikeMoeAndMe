package com.neotech.lesson02;

public class VariableValues {

	public static void main(String[] args) {
		/*
		 * 2. Create a Java program and name it VariableValues In your program create
		 * variables to store all different types of primitive data. Print the value of
		 * each variable. Update value of each variable. Print the value of each
		 * variable after updating.
		 */
		
		//declaring single variable for different Primitive Data types
		byte b3;
		char c3;
		float f1;
		boolean a1;
		
		//assigning value to variables declared above
		b3=125; c3='W'; f1=125.6f; a1=false;
		
		//print out value using variable
		System.out.println(b3);
		System.out.println(c3);
		System.out.println(f1);
		System.out.println(a1);
		
		//changing variable value
		b3=120; c3='V'; f1=120.0f; a1=true;
		
		//print out value using updated variable
		System.out.println("------");
		System.out.println(b3);
		System.out.println(c3);
		System.out.println(f1);
		System.out.println(a1);
			
				
	}
}
