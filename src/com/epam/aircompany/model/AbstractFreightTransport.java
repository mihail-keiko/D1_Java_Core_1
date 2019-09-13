package com.epam.aircompany.model;

public class AbstractFreightTransport extends AbstractAviaTechnique {
    private Double carryingCapacity;

    public Double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(Double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
