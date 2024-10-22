package org.example;

// package org.example;

import org.example.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        // Create and configure cars using the Builder pattern
        Car car1 = new Car.Builder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setInterior("Leather")
                .setColor("Black")
                .setSunroof(true)
                .setGPS(true)
                .setSafetyPackage(true)
                .build();

        Car car2 = new Car.Builder()
                .setEngine("V6")
                .setTransmission("Manual")
                .setInterior("Cloth")
                .setColor("Blue")
                .build();

        System.out.println(car1); // Print details of car1
        System.out.println(car2); // Print details of car2
    }
}
