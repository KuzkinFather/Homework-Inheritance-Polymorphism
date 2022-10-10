package Homework.TheSolarSystem;


public final class SpaceUtils {


    private SpaceUtils() {

    }

    public double calculateGravity(SolarSystem object, SolarSystem object2, double rasstoznieMezghduNimi) {
        return (6.67 * object.getWeight() * object2.getWeight() * rasstoznieMezghduNimi) / 2;
    }

    public boolean trueStar(SolarSystem object) {
        if (object.getDesignation() == Printable.STAR) {
            return true;
        } else {
            return false;
        }
    }

}
