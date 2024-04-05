package com.stackroute.exercises;


import java.util.ArrayList;
import java.util.List;

public class CarDetailsListCreation {
    //Write here logic to return global list variable
    List<Car> carList = new ArrayList<>();
    public String getCarDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Car car : carList) {
            sb.append("{modelName: '").append(car.getModelName()).append("', ");
            sb.append("manufacturerName: '").append(car.getManufacturerName()).append("', ");
            sb.append("engineCapacity: ").append(car.getEngineCapacity()).append(", ");
            sb.append("carType: '").append(car.getCarType()).append("'}, ");
        }
        if (!carList.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
        }
        sb.append("]");
        return sb.toString();
    }

    //Write here logic to add value to global list variable
    public void setCarDetails(String modelName, String manufacturerName, int engineCapacity, String carType) throws WrongInputException, OutOfRangeException {
        if (modelName == null || modelName.trim().isEmpty() || manufacturerName == null || manufacturerName.trim().isEmpty() || carType == null || carType.trim().isEmpty()) {
            throw new WrongInputException("Input might contain a null or empty or blank space value");
        }
        if (engineCapacity < 1000 || engineCapacity > 10000) {
            throw new OutOfRangeException("EngineCapacity is out of range(1000 to 10000)");
        }
        CarType type = null;
        for (CarType carTypeEnum : CarType.values()) {
            if (carTypeEnum.name().equalsIgnoreCase(carType)) {
                type = carTypeEnum;
                break;
            }
        }

        if (type == null) {
            throw new WrongInputException("CarType '" + carType + "' is not present in the enumeration");
        }
        carList.add(new Car(modelName, manufacturerName, engineCapacity, carType));
    }
}
