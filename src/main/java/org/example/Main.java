package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Initializing a vehicle
        Vehicle myVehicle = new Vehicle();
        // Set methods from Vehicle class
        myVehicle.setNumberOfWheels(6);
        myVehicle.setColor("Blue");
        myVehicle.setEngineSize(10);
        myVehicle.setFuelType("Diesel");
        // Get methods from Vehicle class
        System.out.println(myVehicle.getNumberOfWheels());
        System.out.println(myVehicle.getColor());
        System.out.println(myVehicle.getEngineSize());
        System.out.println(myVehicle.getFuelType());
        // Initializing a car
        Car myCar = new Car();
        // Setting and getting a brand (and using honk)
        myCar.setBrand("Honda");
        System.out.println(myCar.getBrand());
        myCar.Honk();
        // Displaying info
        myCar.displayInfo();

    }
}