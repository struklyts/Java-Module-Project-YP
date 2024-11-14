import java.util.ArrayList;
import java.util.Scanner;

import main.java.Car;
import main.java.Race;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = getCars(3);
        Race race = new Race(cars);
        Car winner = race.getWinner();
        System.out.printf("Самая быстрая машина: %s", winner.title);
    }

    public static ArrayList<Car> getCars(int participantsCount) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 1; i <= participantsCount; i++) {
            String title = getCarTitle(scanner, i);
            int speed = getCarSpeed(scanner, i);
            cars.add(new Car(title, speed));
        }

        return cars;
    }

    public static String getCarTitle(Scanner scanner, int participantNumber) {
        System.out.printf("— Введите название машины №%d:", participantNumber);
        return scanner.next();
    }

    public static int getCarSpeed(Scanner scanner, int participantNumber) {
        System.out.printf("— Введите скорость машины №%d:", participantNumber);
        if (!scanner.hasNextInt()) {
            System.out.println("— Неправильная скорость");
            scanner.next();
            return getCarSpeed(scanner, participantNumber);
        }

        int speed = scanner.nextInt();
        if (Car.isSpeedValid(speed)) {
            return speed;
        }
        System.out.println("— Неправильная скорость");

        return getCarSpeed(scanner, participantNumber);
    }
}