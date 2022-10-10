package Homework.TheSolarSystem;

public class Satelite extends SolarSystem {

    private String name;
    private Planet planet;

    public Satelite(int weight, int radius, String name, Planet planet) {
        super(weight, SATELITE, radius);
        this.name = name;
        this.planet = planet;
    }


    @Override
    public boolean comparisingWeight(SolarSystem solarSystem) {
        return getWeight() > solarSystem.getWeight();
    }

    @Override
    public void print() {
        System.out.println("Это " + getDesignation() + " с массой " + getWeight() + " под названием " + getName() + " планеты " + planet.getName());
    }

    public String getName() {
        return name;
    }


}
