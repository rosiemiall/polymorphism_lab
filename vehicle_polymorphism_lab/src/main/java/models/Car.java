package models;

import models.Vehicle;

public class Car extends Vehicle {
    private String brand;
    private boolean tires;
    public Car(String name, double price, double fuelLevel, String brand, boolean tires){
        super(name, price, fuelLevel);
        this.brand = brand;
        this.tires = tires;

    }

    public boolean checkWinterTires() {
        return this.tires;
    }

    public void changeTires() {
        this.tires = !this.tires;

    }

    @Override
    public String makeNoise(){
        return "beep beep";
    }

//    added an overload method
    public String makeNoise(String message){
        return "gargle of an " + message + " car";
    }

}
