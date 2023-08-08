package brian.exercises.exercise11;

import java.util.Scanner;

public class Planet {
    private String name;
    private int satellites;
    private double mass;
    private double volume;
    private int diameter;
    private int distanceToSun;
    private PlanetType type;
    private boolean observable;

    public Planet() {
        this.name = null;
        this.satellites = 0;
        this.mass = 0.0;
        this.volume = 0.0;
        this.diameter = 0;
        this.distanceToSun = 0;
        this.type = null;
        this.observable = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
             this.name = "";
        }
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(int distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public double calculateDensity() {
        return mass / volume;
    }
    

    public boolean isExteriorPlanet() {
        return distanceToSun > 149597870 * 2.1 && distanceToSun < 149597870 * 3.4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planet planet1 = new Planet();

        System.out.print("Introduce el nombre del planeta: ");
        planet1.setName(sc.nextLine());

        System.out.print("Introduce la cantidad de satélites: ");
        planet1.setSatellites(sc.nextInt());

        System.out.print("Introduce la masa en kg: ");
        planet1.setMass(sc.nextDouble());

        System.out.print("Introduce el volumen en km³: ");
        planet1.setVolume(sc.nextDouble());

        System.out.print("Introduce el diámetro en km: ");
        planet1.setDiameter(sc.nextInt());

        System.out.print("Introduce la distancia media al Sol en millones de km: ");
        planet1.setDistanceToSun(sc.nextInt());
        PlanetType planetType = null;
        boolean validInput = false;
        do {
            System.out.print("Introduce el tipo de planeta (GASEOSO, TERRESTRE, ENANO): ");
            String planetTypeInput = sc.nextLine();
            try {
                planetType = PlanetType.valueOf(planetTypeInput.toUpperCase());
                planet1.setType(planetType);
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de planeta inválido. Inténtalo de nuevo.");
            }
        } while (!validInput);

        System.out.println("Nombre: " + planet1.getName());
        System.out.println("Satélites: " + planet1.getSatellites());
        System.out.println("Masa: " + String.format("%.2f", planet1.getMass()) + " kg");
        System.out.println("Volumen: " + String.format("%.2f", planet1.getVolume()) + " km³");
        System.out.println("Diámetro: " + planet1.getDiameter() + " km");
        System.out.println("Distancia al Sol: " + planet1.getDistanceToSun() + " millones de km");
        System.out.println("Tipo: " + planet1.getType());
        System.out.println("Observable ?: " + (planet1.isObservable() ? "si" : "no"));
        System.out.println("Densidad: " + String.format("%.2f", planet1.calculateDensity()) + " kg/km³");
        System.out.println("Es planeta exterior? " + (planet1.isExteriorPlanet() ? "si" : "no"));

        sc.close();
    }
}
