public class Boat extends Vehicle{
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
}
