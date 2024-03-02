package com.neotech.lesson02;

public class DeclareVariables {

	public static void main(String[] args) {
		/*
		 * 1. Create a Java Program (class) and name it DeclareVariables. Create
		 * variables for all 8 primitive Data Types (byte, short, int, long, float,
		 * double, char, boolean). I want you to print out each variable on a separate
		 * line. Try to assign a value outside its range (capacity).
		 */

		byte Monday = -125;// -128<X<127
		short Tuesday = 1;// -32768<X<32767
		int Wednesday = 1010;// -2147483648<X<2147483647
		long Thursday = 10101010101010L;// huge<X<huge

		float Friday = 1.010F;// X varies
		double Saturday = 10.1111;// X varies

		char Sunday = '@';// 0<X<65535
		boolean Lundi = false;// true or false

		System.out.println(Monday);
		System.out.println(Tuesday);
		System.out.println(Wednesday);
		System.out.println(Thursday);
		System.out.println(Friday);
		System.out.println(Saturday);
		System.out.println(Sunday);
		System.out.println(Lundi);

	}

}
