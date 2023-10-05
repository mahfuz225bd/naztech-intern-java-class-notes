Occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
The correct method to be executed is determined at runtime based on the actual type of the object.
This is achieved by using the `@Override` annotation and creating a method with the same signature in the subclass.

Here's a simple Java example that demonstrates polymorphism:

```java
class Animal {
    void makeSound() {
        System.out.println("Some Animal sound"); 
    }
}

class Dog extends Animal {
    @Override void makeSound() {
        System.out.println("Dog Sound Bark");
    }
}

class Cat extends Animal {
    @Override void makeSound() {
        System.out.println("Cat Sound Meow");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal commonAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        commonAnimal.makeSound(); // Calls Common Animals Sound
        myDog.makeSound(); // Calls Dog's makeSound method
        myCat.makeSound(); // Calls Cat's makeSound method
    }
}
```

In this example:

1. We have a superclass **Animal** with a method **makeSound()**.
2. Two subclasses, **Dog** and **Cat**, extend the **Animal** class and override the **makeSound()** method to provide their own implementations.
3. In the **PolymorphismExample** class, we create objects of type **Animal** but instantiate them as **Dog** and **Cat**.
4. When we call the **makeSound()** method on these objects, it invokes the overridden method of the actual object type (polymorphism). This allows us to call **makeSound()** on an **Animal** reference, but the specific implementation is determined at runtime based on the object's actual type.
