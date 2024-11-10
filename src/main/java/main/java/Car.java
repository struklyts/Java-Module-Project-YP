package main.java;

public class Car {
    public String title;
    public int speed;

    public Car(String title, int speed) {
        this.title = title;
        this.speed = speed;
    }

    public static boolean isSpeedValid(int speed) {
        return speed > 0 && speed <= 250;
    }
}
