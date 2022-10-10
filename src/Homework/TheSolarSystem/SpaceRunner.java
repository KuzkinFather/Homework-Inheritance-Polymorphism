package Homework.TheSolarSystem;

public class SpaceRunner {

    public static void main(String[] args) {

        Asteroid asteroid = new Asteroid(22, "2019us13", 20);
        Planet earth = new Planet(40, 88, "Земля", true);
        Planet yupiter = new Planet(80, 140, "Юпитер", false);
        Star sun = new Star(70, 83, "Солнце");
        Satelite satelite = new Satelite(2, 23, "Боро", yupiter);


        System.out.println(earth.comparisingWeight(yupiter));
        printGalactic(asteroid, earth, sun, satelite);

    }

    public static void printGalactic(SolarSystem... Object) {
        for (SolarSystem solarSystem : Object) {
            solarSystem.print();
        }
    }


}

