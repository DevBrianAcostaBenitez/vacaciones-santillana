package brian.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import brian.exercises.exercise12.Car;
import brian.exercises.exercise12.CarType;
import brian.exercises.exercise12.Color;
import brian.exercises.exercise12.FuelType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Exercise12Test {

    @Test
    public void testAccelerateAndBrake() {
        Car car = new Car("Toyota", 2023, 2.5, FuelType.GASOLINA, CarType.SUV, 4, 5, 180, Color.AZUL);

        car.setCurrentSpeed(100); 
        assertEquals(100, car.getCurrentSpeed());

        car.accelerate(30); 
        assertEquals(130, car.getCurrentSpeed());

        car.brake();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testDecelerateBeyondMinSpeed() {
        Car car = new Car("Toyota", 2023, 2.5, FuelType.GASOLINA, CarType.SUV, 4, 5, 180, Color.AZUL);

        car.setCurrentSpeed(100);
        assertEquals(100, car.getCurrentSpeed());

        car.decelerate(120); 
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testEstimatedTimeOfArrival() {
        Car car = new Car("Toyota", 2023, 2.5, FuelType.GASOLINA, CarType.SUV, 4, 5, 180, Color.AZUL);

        car.setCurrentSpeed(100);
        int distanciaKm = 200;
        double tiempoEstimado = car.estimatedTimeOfArrival(distanciaKm);
        assertEquals(2.0, tiempoEstimado, 0.01);
    }

    @Test
    public void testPrintCarDetailsAndZeroSpeed() {
        Car car = new Car("Toyota", 2023, 2.5, FuelType.GASOLINA, CarType.SUV, 4, 5, 180, Color.AZUL);

        car.setCurrentSpeed(0);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        car.printCarDetails();
        String output = outputStream.toString();
        assertTrue(output.contains("Velocidad actual: 0 km/h"));

        assertEquals("Toyota", car.getBrand());
        assertEquals(2023, car.getModel());
        assertEquals(2.5, car.getEngine(), 0.01);
        assertEquals(FuelType.GASOLINA, car.getFuelType());
        assertEquals(CarType.SUV, car.getCarType());
        assertEquals(4, car.getNumberOfDoors());
        assertEquals(5, car.getNumberOfSeats());
        assertEquals(180, car.getMaxSpeed());
        assertEquals(Color.AZUL, car.getColor());
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testExceedMaxSpeed() {
        Car car = new Car("Toyota", 2023, 2.5, FuelType.GASOLINA, CarType.SUV, 4, 5, 180, Color.AZUL);

        car.setCurrentSpeed(180); 
        car.accelerate(10); 
        assertEquals(180, car.getCurrentSpeed()); 
    }
}
