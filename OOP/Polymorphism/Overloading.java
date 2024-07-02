package Polymorphism;

public class Overloading {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading Numbers = new Overloading();
        System.out.println(Numbers.sum(4,5));
        System.out.println(Numbers.sum(4,5,7));
    }
}
