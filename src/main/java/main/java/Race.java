package main.java;

import java.util.ArrayList;

public class Race {
    private final ArrayList<Car> cars;
    private Car winner;

    public Race(ArrayList<Car> cars) {
        this.cars = cars;
        //тут надо кинуть екцепшен если машин меньше 2-х например, но мы их пока не изучали :-)
    }

    public Car getWinner() {
        if (this.winner != null) {
            return this.winner;
        }

        this.winner = cars.get(0);
        for (Car car: cars) {
            if (car.speed > winner.speed) {
                this.winner = car;
            }
        }

        return this.winner;
    }
}
