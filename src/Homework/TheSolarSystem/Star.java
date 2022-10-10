package Homework.TheSolarSystem;

public class Star extends SolarSystem implements WithDiametr {

    private String name;
    private int radius;

    public Star(int weight, int radius, String name) {
        super(weight, STAR, radius);
        this.name = name;
    }


    @Override
    public boolean comparisingWeight(SolarSystem solarSystem) {
        return getWeight() > solarSystem.getWeight();
    }

    @Override
    public void print() {
        System.out.println("Это " + getDesignation() + " с массой " + getWeight() + " её название " + getName() +
                " её длина " + getRadius() + " её диаметр " + getDiagonal());
    }

    @Override
    public double getDiagonal() {
        return Math.abs(getRadius());
    }

    public String getName() {
        return name;
    }
}
