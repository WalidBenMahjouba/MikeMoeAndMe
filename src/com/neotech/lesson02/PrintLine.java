package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {

		// sysout and CTRL + SPACE
		System.out.println("Whats up Scott!!");
		// printLn --> prints the whole statement and then moves to the new line
		// print--> prints the whole statement but it DOES NOT move the cursor to the
		// new lien
		System.out.println("How are you doing??");

		System.out.print("1"); // after printing1, then cursor stays one the same line
		System.out.print("2"); // this line starts printing where the cursor is
		System.out.print("3"); // we are still on the same line

		System.out.println("4");// will be printed on the same line as 3 and then it moves
		// the cursor to the new line
		System.out.println("5");// print in a new line and send the cursor to the new line
		System.out.println("6");
		
		
		// \n--> it is the same as hitting ENTER Key
		System.out.println("Do you like Java? \nYes, I do!");
		
		//this will print an empty line
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n\n\n\n");
		//we can also print multiple empty line
		System.out.println("Something");
		
		
	}

}
