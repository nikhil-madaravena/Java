class Mammal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dolphin extends Mammal {
    void bark() {
        System.out.println("The dolphin is barking.");
    }
}

class Puppy extends Dolphin {
    void weep() {
        System.out.println("The dolphin is weeping.");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Method in Puppy
    }
}
