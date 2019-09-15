package com.epam.aircompany.model;

public abstract class AbstractPassengerTransport extends AbstractAviaTechnique {
    private Integer numberOfSeats;

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
