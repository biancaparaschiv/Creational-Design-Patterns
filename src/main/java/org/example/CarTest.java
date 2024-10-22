package org.example;
import static org.junit.Assert.*;
import org.junit.Test;
import org.example.builder.Car;

public class CarTest {

    @Test
    public void testCarBuilder() {
        Car car = new Car.Builder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setInterior("Leather")
                .setColor("Red")
                .setSunroof(true)
                .setGPS(true)
                .setSafetyPackage(true)
                .build();

        assertNotNull(car);
        assertTrue("Car engine should be V8", car.toString().contains("V8"));
        assertTrue("Car transmission should be Automatic", car.toString().contains("Automatic"));
        assertTrue("Car interior should be Leather", car.toString().contains("Leather"));
    }
}
