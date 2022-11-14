package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPer1km;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPer1km){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPer1km = fuelCostPer1km;
        this.distanceTraveled = 0;
    }

    public boolean hasEnoughFuel(int distance) {
        double fuelNeeded = this.fuelCostPer1km * distance;
        if(fuelNeeded <= this.fuelAmount) {
            return true;
        }
        return false;
    }

    public void reduceFuel(int distance) {
        this.fuelAmount -= distance * fuelCostPer1km;
    }

    public void increaseDistance(int distance) {
        this.distanceTraveled += distance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",
                this.model,
                this.fuelAmount,
                this.distanceTraveled
        );
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCostPer1km() {
        return fuelCostPer1km;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
