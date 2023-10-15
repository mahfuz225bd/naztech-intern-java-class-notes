## Control Flow Statement in Java

Control flow statements in Java are constructs that determine the order in which the instructions within a program are executed. They allow you to control the flow of your program's logic based on conditions and loops. Java provides three types of control flow statements:

- Conditional Statements or Decision Making Statements
  - if statements
    - if statement (Simple if)
    - if-else statement
    - if-else-if statement
    - Nested if-statement
  - switch statement
- Loop Statements
  - do while loop
  - while loop
  - for loop
  - for-each loop
- Jump Statements
  - break statement
  - continue statement

### Conditional Statements

#### If Statements
##### `if` Statement

The `if` statement is used to execute a block of code if a specified condition is true. Here is the basic structure of `if` statement:

```
if (condition) {
    // executes when condition is true
}
```

Example:

```java
public class CheckAdult {
  public static void main(String[] args) {
    int age = 25;
    if (x >= 18) {
      System.out.println("You are adult.");
    }
  }
}
```

##### `if`-`else` Statement

The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block. The else block is executed if the condition of the if-block is evaluated as false. Here is the basic structure of `if else` statement:

```
if(condition) {    
    // executes when condition is true   
}  
else{  
    // executes when condition is false   
}  
```

Example:
```java
public class CheckAdultOrMinor {
  public static void main(String[] args) {
    int age = 25;
    if (x >= 18) {
      System.out.println("You are adult");
    } else {
        System.out.println("You are minor");
    }
  }
}
```

##### `if`-`else if` Statement

The if-else-if statement contains the if-statement followed by multiple else-if statements. In other words, we can say that it is the chain of if-else statements that create a decision tree where the program may enter in the block of code where the condition is true. We can also define an else statement at the end of the chain. Here is the basic structure of `if`-`else if` statement:

```
if (condition 1) {
  // executes when condition 1 is true   
} else if (condition 2) {
  // executes when condition 2 is true   
} else {
  // executes when all the conditions are false   
}
```

Example:

```java
public class CheckOneTwoOrThree {
   public static void main(String args[]) {
      int x = 3;

      if (x == 1) {
         System.out.print("Value of x is 1");
      } else if (x == 2) {
         System.out.print("Value of x is 2");
      } else if (x == 3) {
         System.out.print("Value of x is 3");
      } else {
         System.out.print("This is else statement");
      }
   }
}
```

##### Nested if-statement

In nested if-statements, the ```if``` statement can contain a ```if``` or ```if```-```else``` statement inside another if or ```if```-```else``` statement. Here is the basic structure of nested if-statement:

```
if (condition 1) {
  //executes when condition 1 is true   
  if (condition 2) {
    //executes when condition 2 is true   
  } else {
    //executes when condition 2 is false   
  }
} else {
    //executes when condition 1 is false
}
```

Example:

```java
public class NestedIfExample {
  public static void main(String[] args) {
    String address = "Delhi, India";

    if (address.endsWith("India")) {
      if (address.contains("Meerut")) {
        System.out.println("Your city is Meerut");
      } else if (address.contains("Noida")) {
        System.out.println("Your city is Noida");
      } else {
        System.out.println(address.split(",")[0]);
      }
    } else {
      System.out.println("You are not living in India");
    }
  }
}
```

#### `switch` Statement

The `switch` statement allows you to select one of many code blocks to be executed, based on the value of an expression. Here is the basic structure of `switch` statement:

    ```
    switch (expression){
        case value1:
            // Code for value1
            break;
        case value2:
            // Code for value2
            break;
        default:
            // Code if no case matches
    }
    ```

    Example:
    ```java
    import java.util.Scanner;

    public class SwitchExample {
        public static void main(String[] args) {
            int number = 1;

            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                default:
                    System.out.println("Not Zero, One or Two");
            }
        }
    }
    ```
