package com.marek.behavioral.memento;

public class DietInfo {
    private String personName;
    private int dayNumber;
    private int weight;

    public DietInfo (String personName, int dayNumber, int weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name : " + personName + ", day number: " + dayNumber + ", weight: " + weight;
    }

    public void setDayNumberAndWeight(int dayNumber, int weight) {
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    public Memento save() {
        return new Memento(personName, dayNumber, weight);
    }

    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        personName = memento.mementoPersonName;
        dayNumber = memento.mementoDayNumber;
        weight = memento.mementoWeight;
    }

    public int getWeight() {
        return weight;
    }

    private class Memento {
        public String mementoPersonName;
        public int mementoDayNumber;
        public int mementoWeight;

        public Memento(String personName, int dayNumber, int weight) {
            this.mementoPersonName = personName;
            this.mementoDayNumber = dayNumber;
            this.mementoWeight = weight;
        }
    }
}
