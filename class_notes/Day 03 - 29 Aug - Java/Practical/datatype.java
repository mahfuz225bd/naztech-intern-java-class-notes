package com.example;

import java.util.Scanner;

// This program explain all primitive datatypes.
// 8 bit = 1 byte (Please, look at this.)

public class Hello {

    public static void main(String[] args) {
    	Scanner dataCollect = new Scanner(System.in);	

    	// Byte can collect one bytes data.
    	System.out.print("Enter your 'Byte' number: ");
    	byte byteNumber = dataCollect.nextByte(); 
    	System.out.println("your 'Byte' number is " + byteNumber + ".");
    	
    	// Char can collect two bytes data.
    	// At a time char can collect only one letter.
    	System.out.print("\nEnter your 'Char' letter: ");
    	char charLetter = dataCollect.next().charAt(0); 
    	System.out.println("your 'Char' letter is " + charLetter + ".");
    	
    	// Short can collect two bytes data.
    	System.out.print("\nEnter your 'Short' number: ");
    	short shortNumber = dataCollect.nextShort(); 
    	System.out.println("your 'Short' number is " + shortNumber + ".");
    	
    	// Integer can collect four bytes data.
    	System.out.print("\nEnter your 'Integer' number: ");
    	int intNumber = dataCollect.nextInt(); 
    	System.out.println("your 'Integer' number is " + intNumber + ".");
    	
    	// Long can collect eight bytes data.
    	System.out.print("\nEnter your 'Long' number: ");
    	long longNumber = dataCollect.nextLong(); 
    	System.out.println("your 'Long' number is " + longNumber + ".");
    	
    	// Float can collect four bytes data.
    	System.out.print("\nEnter your 'Float' number: ");
    	float floatNumber = dataCollect.nextFloat(); 
    	System.out.println("your 'Float' number is " + floatNumber + ".");
    	
    	// Double can collect eight bytes data.
    	System.out.print("\nEnter your 'Double' number: ");
    	double doubleNumber = dataCollect.nextDouble();
    	System.out.println("your 'Double' number is " + doubleNumber + ".");
    	
    	
    	// Boolean can process one bit data(true or false).
    	System.out.println("\nEnter two integer number: ");
    	int intNumber1 = dataCollect.nextInt(); // collect integer data.
    	int intNumber2 = dataCollect.nextInt();
    	boolean chackBoolean = intNumber1 > intNumber2; // condition chack.
    	System.out.println("your 'Boolean' output is " + chackBoolean + ".");
    	
    	dataCollect.close(); // Scanner stop to scan or take input from user.
    	
    }
}
