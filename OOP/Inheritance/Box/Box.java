package Inheritance.Box;

public class Box {
    double length;
    double height;
    double weight;

    public Box() {
        this.height = -1;
        this.length = -1;
        this.weight = -1;

    }

    Box(double length,double weight,double height) {
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    public String displayBox() {
        return "Length: " + length + ", Height: " + height + ", Weight: " + weight;
    }
}



