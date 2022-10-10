package Homework.TheSolarSystem;

import Homework.TheSolarSystem.Printable;

public class Asteroid extends SolarSystem implements WithArea {

    private String name;


    public Asteroid(int weight, String name, int radius) {
        super(weight, ASTEROID, radius);
        this.name = name;
    }

    @Override
    public boolean comparisingWeight(SolarSystem solarSystem) {
        return getWeight() > solarSystem.getWeight();
    }

    @Override
    public void print() {
        System.out.println("Это " + getDesignation() + " с массой " + getWeight() + " его название " + getName() + " его длина " + getRadius() + ", а площадь " + getArea());
    }

    @Override
    public double getArea() {
        return getRadius() * 2;
    }

    public String getName() {
        return name;
    }


}
