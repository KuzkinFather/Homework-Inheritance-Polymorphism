package Homework.TheSolarSystem;

public abstract class SolarSystem implements Printable {

    private int weight;
    private int radius;
    private String designation;

    public SolarSystem() {

    }

    public SolarSystem(int weight, String designation, int radius) {
        this.weight = weight;
        this.designation = designation;
        this.radius = radius;
    }

    public abstract boolean comparisingWeight(SolarSystem solarSystem);

    @Override
    public void print() {

    }

    public int getWeight() {
        return weight;
    }


    public int getRadius() {
        return radius;
    }

    public String getDesignation() {
        return designation;
    }

}
