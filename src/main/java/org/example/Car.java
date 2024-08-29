package org.example;

public class Car extends Vehicle {
    // Attribute for car
    private String brand;
    // Constructor for car
    public Car(){
        this.brand = "Toyota";
    }
    // Honk method
    public void Honk(){
        System.out.println("Honk, honk!");
    }
    // Displays all the info that we have set
    public void displayInfo(){
        System.out.println("Number of wheels: " + this.getNumberOfWheels() + "\n" + "Color: " + this.getColor() + "\n" + "Engine Size: " + this.getEngineSize() + "\n" + "Fuel Type: " + this.getFuelType() + "\n" + "Brand: " + this.getBrand());
    }
    //Set and get for brand
    public void setBrand(String o){this.brand = o;}
    public String getBrand(){return this.brand;}


}
