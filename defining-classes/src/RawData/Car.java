package RawData;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> newTires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = newTires;
    }

    public double calculatePressure() {
        double totalPressure = 0;
        for(Tire tire: this.tires) {
            totalPressure += tire.getPressure();
        }

        return Math.floor(totalPressure / 4);
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getModel() {
        return model;
    }
}
