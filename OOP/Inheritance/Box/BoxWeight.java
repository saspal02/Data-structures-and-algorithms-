package Inheritance.Box;

public class BoxWeight extends Box {
    double w;

    public BoxWeight() {
        this.w = -1;
    }

    public BoxWeight(double length, double height, double weight, double w) {
        super(length,height,weight);// Calls the parent class constructor
        // used to initialize values in parent class
        this.w = w;
    }

}
