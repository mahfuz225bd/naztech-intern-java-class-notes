# Day 10 - 20 Sep

## Concepts Will Be Discussed

- Polymorphism Concept
- Method Overloading
- Method Overriding

## Polymorphism

Polymorphism is a fundamental concept in object-oriented programming and is a key feature of the Java programming language. It allows objects of different classes to be treated as objects of a common superclass. In simpler terms, polymorphism enables you to work with objects of different types through a common interface.
Suppose, Animal is a base class which has some attributes and methods that have all exists in all animals and some other classes is designed and they are Dog, Cat, Cow, House, inherited attributes and methods from Animal class.

![Example of Polymorphism](./images/day10/Polymorphism%20Example.jpg "Example of Polymorphism")

There are two main types of polymorphism in Java:
- Compile-Time Polymorphism (Static Binding)
- Run-Time Polymorphism (Dynamic Binding)

### Compile-Time Polymorphism

Compile-time polymorphism, also known as static binding or method overloading, occurs when multiple methods in the same class have the same name but different parameters (different number or types of parameters). The compiler determines which method to call based on the method's signature at compile time.
> **Note:** 

Here's an example:

```java
class Calculator { 
    int add(int num1, int num2) { 
        return num1 + num2; 
    }
    double add(double num1, double num2) {
        return num1 + num2;
    }
    String add(String str1, String str2) {
        return str1 + str2; 
    }
}

public class CompileTimePolymorphism { 
    public static void main(String[] args) { 
        Calculator calculator = new Calculator(); 

        int sum1 = calculator.add(5, 7); // Calls the int version of add
        System.out.println("Sum1: " + sum1); 
        
        double sum2 = calculator.add(3.14, 2.71); // Calls the double version of add 
        System.out.println("Sum2: " + sum2); 
        
        String result = calculator.add("Hello, ", "world!"); // Calls the String version of add System.out.println("Sum1: " + sum1);
        System.out.println("Concatenated String: " + result); 
    } 
}
```

### Run-Time Polymorphism

Polymorphism is a fundamental concept in object-oriented programming, allowing objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different types of objects, providing flexibility and extensibility to your code. In Java, polymorphism is typically achieved through method overriding and interfaces. Also known as method overriding.

For more see [Class Note](../Day%2012%20-%2027%20Sep%20-%20Java/) on 27 September.