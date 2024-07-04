package Interfaces;

public class Car implements Engine,Brake,Media {

    @Override
    public void brake() {
        System.out.println("Brake pressed!");

    }

    @Override
    public void start() {
        System.out.println("Start the car");

    }

    @Override
    public void stop() {
        System.out.println("Stop the car");

    }

    @Override
    public void acc() {
        System.out.println("Acclerate the car");

    }
}
