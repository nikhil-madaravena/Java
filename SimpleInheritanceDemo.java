class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class SimpleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Method in Dog class
    }
}
