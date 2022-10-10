package Homework.TheSolarSystem;

public class Planet extends SolarSystem {

    private String name;
    private boolean inhabited;

    public Planet(int weight, int radius, String name, boolean inhabited) {
        super(weight, PLANET, radius);
        this.name = name;
        this.inhabited = inhabited;
    }

    @Override
    public boolean comparisingWeight(SolarSystem solarSystem) {
        return getWeight() > solarSystem.getWeight();
    }

    @Override
    public void print() {
        String result = "";
        if (isInhabited() == true) {
            result = INHABITED;
        } else {
            result = NOT_INHABITED;
        }

        System.out.println("Это " + getDesignation() + " с массой " + getWeight() + " её название " + getName() + " она " + result);

    }

    public String getName() {
        return name;
    }

    public boolean isInhabited() {
        return inhabited;
    }

}
