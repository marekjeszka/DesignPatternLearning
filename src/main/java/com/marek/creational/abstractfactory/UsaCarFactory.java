package com.marek.creational.abstractfactory;

public class UsaCarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch(model)
        {
            case SMALL:
                car = new SmallCar(Location.USA);
                break;
            case SEDAN:
                car = new SedanCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}
