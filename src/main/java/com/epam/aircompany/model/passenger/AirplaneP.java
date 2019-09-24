package com.epam.aircompany.model.passenger;

import com.epam.aircompany.model.AbstractPassengerTransport;

public class AirplaneP extends AbstractPassengerTransport {
    private Double takeOffLength;

    public AirplaneP() {
    }

    public AirplaneP(Double takeOffLength) {
        this.takeOffLength = takeOffLength;
    }

    public Double getTakeOffLength() {
        return takeOffLength;
    }

    public void setTakeOffLength(Double takeOffLength) {
        this.takeOffLength = takeOffLength;
    }
}
