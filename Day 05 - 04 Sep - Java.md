# Day 05 - 04 Sep

## For Loop

In Java, a for loop is a control structure that allows you to execute a block of code repeatedly based on a specified condition. It's commonly used when you know in advance how many times you want to repeat a certain task. Let's break down the parts of a for loop:

```
for (initialization; condition; update) {
    // Code to be executed repeatedly
}
```

Here's what each part does:
1. **Initialization:** This is where you initialize a control variable (usually an integer) to a starting value. It's executed only once when the loop begins.

2. **Condition:** This is a boolean expression that's checked before each iteration of the loop. If the condition is ```true```, the loop continues to execute. If it's ```false```, the loop terminates.

3. **Update:** This part is responsible for changing the value of the control variable after each iteration. It's executed at the end of each iteration, just before re-checking the condition.

Now, let's look at an example:

```java
for (int i = 1; i<= 5; i++) {
    System.out.println("Iteration " + i); 
} 
```

In this example:
- **Initialization:** ```int i = 1``` initializes i to 1.
- **Condition:** ```i <= 5``` checks if i is less than or equal to 5.
- **Update:** ```i++``` increments i by 1 after each iteration.

Output:

```
Iteration 1
Iteration 2
Iteration 3
Iteration 4
Iteration 5 
```

The loop starts with i equal to 1. It prints "Iteration 1," increments i to 2, and so on until i becomes 6, at which point the condition becomes ```false```, and the loop terminates.

You can use ```for``` loops for a wide range of tasks, such as iterating over arrays, processing data, or performing calculations. They provide precise control over the number of iterations, making them a valuable tool in Java programming.

