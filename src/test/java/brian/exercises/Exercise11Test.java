package brian.exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import brian.exercises.exercise11.Planet;
import brian.exercises.exercise11.PlanetType;

public class Exercise11Test {

    @Test
    public void testPlanetAttributesEarth() {
        Planet earth = new Planet();

        earth.setName("Tierra");
        earth.setSatellites(1);
        earth.setMass(5.972e24);
        earth.setVolume(1.08321e12);
        earth.setDiameter(12756);
        earth.setDistanceToSun(147);
        earth.setType(PlanetType.TERRESTRE);
        earth.setObservable(true);

        assertEquals("Tierra", earth.getName());
        assertEquals(1, earth.getSatellites());
        assertEquals(5.972e24, earth.getMass(), 1e15);
        assertEquals(1.08321e12, earth.getVolume(), 1e9);
        assertEquals(12756, earth.getDiameter());
        assertEquals(147, earth.getDistanceToSun());
        assertEquals(PlanetType.TERRESTRE, earth.getType());
        assertTrue(earth.isObservable());
        assertEquals(5.513243046131406E12, earth.calculateDensity(), 0.01);
        assertFalse(earth.isExteriorPlanet());
    }
}