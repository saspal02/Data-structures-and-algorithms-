package Interfaces;

public class CDPlayer implements Media {


    @Override
    public void start() {
        System.out.println("Start the music");

    }

    @Override
    public void stop() {
        System.out.println("Stop the music");

    }
}
