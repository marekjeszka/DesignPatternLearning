package com.marek.creational.abstractfactory;

public abstract class Car {
    private final CarType model;
    private final Location location;

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();

    public Location getLocation() {
        return location;
    }

    public CarType getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Model- " + model + " built in " + location;
    }
}
