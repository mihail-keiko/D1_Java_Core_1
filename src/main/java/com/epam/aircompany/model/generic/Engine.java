package com.epam.aircompany.model.generic;

public class Engine {
    private String manufacturer;
    private Double power;
    private Double fuelConsumption;

    public Engine() {
    }

    public Engine(String manufacturer, Double power, Double fuelConsumption) {
        this.manufacturer = manufacturer;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
