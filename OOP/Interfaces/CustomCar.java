package Interfaces;

public class CustomCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public CustomCar() {
        engine = new PowerEngine();

    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new PowerEngine();
    }

}
