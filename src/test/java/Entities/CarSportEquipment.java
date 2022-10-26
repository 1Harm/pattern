package Entities;

import Decorator.CarDecorator;

public class CarSportEquipment extends CarDecorator {

    private Car car;

    public CarSportEquipment(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
