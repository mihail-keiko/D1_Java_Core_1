package com.epam.aircompany.model;

import com.epam.aircompany.model.generic.Engine;

public class AbstractAviaTechnique implements Comparable<AbstractAviaTechnique> {
    private String name;
    private Engine engine;
    private String inventoryNumber;
    private String releaseYear;
    private Double rangeOfFlight;

    public AbstractAviaTechnique() {
    }

    public AbstractAviaTechnique(String name, Engine engine, String inventoryNumber, String releaseYear, Double rangeOfFlight) {
        this.name = name;
        this.engine = engine;
        this.inventoryNumber = inventoryNumber;
        this.releaseYear = releaseYear;
        this.rangeOfFlight = rangeOfFlight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(Double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    @Override
    public int compareTo(AbstractAviaTechnique obj) {
        if (this.getRangeOfFlight() > obj.getRangeOfFlight()) {
            return 1;
        }
        if (this.getRangeOfFlight() < obj.getRangeOfFlight()) {
            return -1;
        }
        return 0;
    }
}
