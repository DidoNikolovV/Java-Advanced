package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        this.color = "n/a";
    }



    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
        this.weight = 0;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.weight == 0) {
            return this.model + ":\n"+
                    this.engine.toString() + "\n" +
                    "Weight: n/a" + "\n" +
                    "Color: " + this.color + "\n";
        }

        return this.model + ":\n"+
                this.engine.toString() + "\n" +
                "Weight: " + this.weight + "\n" +
                "Color: " + this.color + "\n";

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
