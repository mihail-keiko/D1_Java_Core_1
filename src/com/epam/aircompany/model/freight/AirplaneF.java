package com.epam.aircompany.model.freight;

import com.epam.aircompany.model.AbstractFreightTransport;

public class AirplaneF extends AbstractFreightTransport {
    private Double takeOffLength;

    public AirplaneF() {
    }

    public AirplaneF(Double takeOffLength) {
        this.takeOffLength = takeOffLength;
    }

    public Double getTakeOffLength() {
        return takeOffLength;
    }

    public void setTakeOffLength(Double takeOffLength) {
        this.takeOffLength = takeOffLength;
    }
}
