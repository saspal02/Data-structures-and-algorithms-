package Interfaces;

public class Main {
    public static void main(String[] args) {
 //       Car car = new Car();
//        car.start();
//        car.acc();
//        car.stop();
//        car.brake();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        CustomCar car = new CustomCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.stop();


    }

}
