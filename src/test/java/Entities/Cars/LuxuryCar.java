package Entities.Cars;

import Entities.Car;

public class LuxuryCar extends Car {

    private Car car;

    public LuxuryCar(Car car) {
        super(car);
    }

    public LuxuryCar(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
