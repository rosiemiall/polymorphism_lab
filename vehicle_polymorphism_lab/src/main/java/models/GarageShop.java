package models;

import java.util.ArrayList;

public class GarageShop {

    private String name;
    private ArrayList<Vehicle> vehicles;
    private double till;

    public GarageShop(){
        this.vehicles = new ArrayList<>();
        this.till = 0;
    }


    public void addToStock(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public ArrayList getStock() {
        return this.vehicles;
    }


    public void sellItem(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
        this.till += vehicle.getPrice();
    }

    public double getTill() {
        return this.till;
    }
}
