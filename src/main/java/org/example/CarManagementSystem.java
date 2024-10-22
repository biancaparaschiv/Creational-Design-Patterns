package org.example;

import org.example.builder.Car;
import org.example.factory.Document;
import org.example.factory.DocumentFactory;

public class CarManagementSystem {

    public static void main(String[] args) {
        // Create and configure a car
        Car car = new Car.Builder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setInterior("Leather")
                .setColor("Red")
                .setSunroof(true)
                .setGPS(true)
                .setSafetyPackage(true)
                .build();

        // Choose a document format to describe the car
        String docType = "PDF";  // You can switch to "Word" or "HTML"
        Document doc = DocumentFactory.createDocument(docType);
        doc.open();

        // Print car details in the document
        System.out.println("Saving car details: " + car);
    }
}
