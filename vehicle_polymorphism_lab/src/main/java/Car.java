public class Car extends Vehicle{
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
}
