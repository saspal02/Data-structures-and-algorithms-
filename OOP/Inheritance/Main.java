package Inheritance;

import Inheritance.Box.Box;
import Inheritance.Box.BoxWeight;
import Inheritance.Super.Child;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.displayBox());
        BoxWeight box2 = new BoxWeight(2,3,4,6);
        System.out.println(box2.displayBox());

        Child child = new Child();

    }
}