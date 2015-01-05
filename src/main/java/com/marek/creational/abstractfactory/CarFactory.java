package com.marek.creational.abstractfactory;

public abstract class CarFactory {
    private CarFactory() {

    }

    public static Car buildCar(CarType model) {
        Car car = null;
        Location location = Location.ASIA; // in real scenario it can be system property, properties file etc.
        switch(location)
        {
            case ASIA:
                car = AsiaCarFactory.buildCar(model);
                break;
            case EUROPE:
                car = EuropeCarFactory.buildCar(model);
                break;
            case USA:
                car = UsaCarFactory.buildCar(model);
                break;
        }
        return car;
    }
}
