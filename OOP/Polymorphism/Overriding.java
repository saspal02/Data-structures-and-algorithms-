package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog(); // Animal reference but Dog object

        myAnimal.sound(); // Calls the method from Animal class
        myDog.sound(); // Calls the overridden method from Dog class
    }
}
