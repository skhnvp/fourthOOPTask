package ru.stepup.oop;

public class Road {
    private City city;
    private int cost = 0;

    public Road(City city) {
        new Road(city, 0);
    }

    public Road(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return city.getName() + ": " + cost;
    }
}
