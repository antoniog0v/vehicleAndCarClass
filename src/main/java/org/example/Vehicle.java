package org.example;

public class Vehicle {
    // All attributes for vehicle
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    // Constructor for vehicle

    public Vehicle(){
        this.numberOfWheels = 4;
        this.color = "Red";
        this.engineSize = 1;
        this.fuelType = "Gasoline";

    }

    // Sets and gets for all vehicle attributes

    public void setNumberOfWheels(int o){this.numberOfWheels = o;}
    public int getNumberOfWheels(){return this.numberOfWheels;}

    public void setColor(String o){this.color = o;}
    public String getColor(){return this.color;}

    public void setEngineSize(float o){this.engineSize = o;}
    public float getEngineSize(){return this.engineSize;}

    public void setFuelType(String o){this.fuelType = o;}
    public String getFuelType(){return this.fuelType;}



}
