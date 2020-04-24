package com.company.planes;

public class Plane {
    private String model;
    private PlaneEngine engine;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PlaneEngine getEngine() {
        return engine;
    }

    public void setEngine(PlaneEngine engine) {
        System.out.println("new by type!");
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
