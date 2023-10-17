package models;

public abstract class Vehicle {

    protected String name;
    protected double price;
    protected double fuelLevel;

    public Vehicle(String name, double price, double fuelLevel){
        this.name = name;
        this.price = price;
        this.fuelLevel = fuelLevel;
    }


//    an abstract method in the super class
    public abstract String makeNoise();


    public double checkFuel() {
        return this.fuelLevel;
    }

    public void fillFuel(){
         this.fuelLevel = 100;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
