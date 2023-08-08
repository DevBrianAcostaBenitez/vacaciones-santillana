package brian.exercises.exercise12;

import java.util.Scanner;

public class Car {
    private String brand;
    private int model;
    private double engine;
    private FuelType fuelType;
    private CarType carType;
    private int numberOfDoors;
    private int numberOfSeats;
    private int maxSpeed;
    private Color color;
    private int currentSpeed;

    public Car(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoors,
            int numberOfSeats, int maxSpeed, Color color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.currentSpeed = 0;
    }

  

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = (speed >= 0 && speed <= maxSpeed) ? speed : Math.min(Math.max(speed, 0), maxSpeed);
    }

    public void accelerate(int speedIncrease) {
        setCurrentSpeed((currentSpeed + speedIncrease) * (currentSpeed + speedIncrease <= maxSpeed ? 1 : 0) + (currentSpeed + speedIncrease > maxSpeed ? maxSpeed : 0));
    }

    public void decelerate(int speedDecrease) {
        setCurrentSpeed((currentSpeed - speedDecrease) * (currentSpeed - speedDecrease >= 0 ? 1 : 0) + (currentSpeed - speedDecrease < 0 ? 0 : currentSpeed - speedDecrease));
    }

    public void brake() {
        setCurrentSpeed(0);
    }

    public double estimatedTimeOfArrival(int distanceInKm) {
        return (currentSpeed == 0) ? -1 : (double) distanceInKm / currentSpeed;
    }

    public void printCarDetails() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Motor: " + engine + " litros");
        System.out.println("Tipo de combustible: " + fuelType);
        System.out.println("Tipo de automóvil: " + carType);
        System.out.println("Número de puertas: " + numberOfDoors);
        System.out.println("Cantidad de asientos: " + numberOfSeats);
        System.out.println("Velocidad máxima: " + maxSpeed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + currentSpeed + " km/h");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la marca del automóvil: ");
        String brand = sc.nextLine();

        System.out.print("Introduce el modelo del automóvil: ");
        int model = sc.nextInt();

        System.out.print("Introduce el volumen del motor en litros: ");
        double engine = sc.nextDouble();
        sc.nextLine();

        System.out.print("Introduce el tipo de combustible (GASOLINA, BIOETHANOL, DIESEL, BIODIESEL, NATURAL_GAS): ");
        FuelType fuelType = FuelType.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Introduce el tipo de automóvil (CIUDAD, SUBCOMPACT, COMPACT, FAMILY, EXECUTIVE, SUV): ");
        CarType carType = CarType.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Introduce el número de puertas del automóvil: ");
        int numberOfDoors = sc.nextInt();

        System.out.print("Introduce el número de asientos del automóvil: ");
        int numberOfSeats = sc.nextInt();

        System.out.print("Introduce la velocidad máxima del automóvil en km/h: ");
        int maxSpeed = sc.nextInt();

        System.out.print("Introduce el color del automóvil (BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA): ");
        Color color = Color.valueOf(sc.next().toUpperCase());

        Car car = new Car(brand, model, engine, fuelType, carType, numberOfDoors, numberOfSeats, maxSpeed, color);

        System.out.println("\n¡Automóvil creado exitosamente!");

        car.setCurrentSpeed(100);

        System.out.println("\nDetalles del automóvil:");
        car.printCarDetails();
        System.out.println("Acelerando ");
        car.accelerate(20);
        System.out.println("Velocidad actual: " +car.getCurrentSpeed());
        System.out.println("decelerando");
        car.decelerate(50);
        System.out.println("Velocidad actual: " +car.getCurrentSpeed());
        System.out.println("Frenando");
        car.brake();
        System.out.println("Velocidad actual: " +car.getCurrentSpeed());

        sc.close();
    }
}
