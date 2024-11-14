package main.java;

public class Car {
    final public String title;
    final public int speed;

    public Car(String title, int speed) {
        this.title = title;
        this.speed = speed;
    }

    public static boolean isSpeedValid(int speed) {
        return speed > 0 && speed <= 250;
    }
}
