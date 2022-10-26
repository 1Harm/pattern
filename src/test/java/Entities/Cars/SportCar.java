package Entities.Cars;

import Entities.Car;

public class SportCar extends Car {

    private Car car;

    public SportCar(Car car) {
        super(car);
    }

    public SportCar(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
