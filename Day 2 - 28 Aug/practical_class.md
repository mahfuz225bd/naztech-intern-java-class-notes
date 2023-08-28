## Programming Practices
HelloWorld.java: A program to print "Hello, World"
```
public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello, World");
	}
}
```

UserInput.java: Write a program that take user input to show some output
```
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("What is you name?: ");
		
		String name;
		name = myScanner.nextLine();

		// Output: Welcome, {Inputed name}
		System.out.println("Welcome, " + name);
	}
}
```

CommandLineArg.java: Write a program to show some text by command line arguments.
```
public class CommandLineArg {
	public static void main(String[] args) {
		System.out.println(args[0] + " " + args[1] + " " + args[2]);
	}
}
```

## Test
### 10 Reserved Words of Java
if, else, try, catch, finally, for, do, while, class, public, protected, private etc.

### Data Types
- Char - *char*
- String - *String*
- Byte - *byte*
- Boolean - *bool*
- Integer - *int*
- Double - *double*
- Float - *float*
- Short - *short*

### Access Modifes in Java
- default
- public
- protected
- private

### 5 Valid Variable Names in Java
- name
- name2
- $name
- _name
- full_name