import java.util.Scanner;

// This program implemented all primitive data types to understand.
// 8 bit = 1 byte

public class DataTypes {

    public static void main(String[] args) {
    	Scanner dataCollect = new Scanner(System.in);	

    	// Size of Byte = 1 byte
    	System.out.print("Enter your 'Byte' number: ");
    	byte byteNumber = dataCollect.nextByte(); 
    	System.out.println("your 'Byte' number is " + byteNumber + ".");
    	
    	// Size of Char = 2 bytes, which can contain single character of a string
    	System.out.print("\nEnter your 'Char' letter: ");
    	char charLetter = dataCollect.next().charAt(0); 
    	System.out.println("your 'Char' letter is " + charLetter + ".");
    	
    	// Size of Short = 2 bytes
    	System.out.print("\nEnter your 'Short' number: ");
    	short shortNumber = dataCollect.nextShort(); 
    	System.out.println("your 'Short' number is " + shortNumber + ".");
    	
    	// Size of Integer = 4 bytes
    	System.out.print("\nEnter your 'Integer' number: ");
    	int intNumber = dataCollect.nextInt(); 
    	System.out.println("your 'Integer' number is " + intNumber + ".");
    	
    	// Size of Long = 8 bytes
    	System.out.print("\nEnter your 'Long' number: ");
    	long longNumber = dataCollect.nextLong(); 
    	System.out.println("your 'Long' number is " + longNumber + ".");
    	
    	// Size of Float = 4 bytes
    	System.out.print("\nEnter your 'Float' number: ");
    	float floatNumber = dataCollect.nextFloat(); 
    	System.out.println("your 'Float' number is " + floatNumber + ".");
    	
    	// Size of Double = 8 bytes
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
