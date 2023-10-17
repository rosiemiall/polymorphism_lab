package models;

import interfaces.Floatable;

public class Boat extends Vehicle implements Floatable {
    private boolean anchor;
    public Boat(String name, double price, double fuelLevel, boolean anchor){
        super(name, price, fuelLevel);
        this.anchor = anchor;
    }


    public boolean checkAnchor() {
        return this.anchor;
    }

    public void addAnchor() {
        this.anchor = true;
    }
    public String makeNoise(){
        return "neom";
    }

// implemented the interface floatable onto boat class
    public String floats(boolean ableToFloat){
        if (ableToFloat){
            return "This boat can float";
        } else {
            return "This boat can't float";
        }

    }

}
