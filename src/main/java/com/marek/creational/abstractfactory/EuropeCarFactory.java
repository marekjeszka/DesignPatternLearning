package com.marek.creational.abstractfactory;

public class EuropeCarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch(model)
        {
            case SMALL:
                car = new SmallCar(Location.EUROPE);
                break;
            case SEDAN:
                car = new SedanCar(Location.EUROPE);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.EUROPE);
                break;
        }
        return car;
    }
}
