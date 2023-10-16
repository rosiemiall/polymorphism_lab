public class CamperVan extends Vehicle{
    private boolean clean;
    public CamperVan(String name, double price, double fuelLevel, boolean clean){
        super(name, price, fuelLevel);
        this.clean = clean;
    }

    public boolean checkClean() {
        return this.clean;
    }

    public void cleanUp() {
        this.clean = true;
    }
}
