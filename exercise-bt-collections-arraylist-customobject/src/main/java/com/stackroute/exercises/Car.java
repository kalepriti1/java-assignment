package com.stackroute.exercises;

// Custom Class
public class Car {
    private String modelName;
    private String manufacturerName;
    private int engineCapacity;
    private String carType;

    public Car(String modelName, String manufacturerName, int engineCapacity, String carType) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.engineCapacity = engineCapacity;
        this.carType = carType;
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getCarType() {
        return carType;
    }
}
