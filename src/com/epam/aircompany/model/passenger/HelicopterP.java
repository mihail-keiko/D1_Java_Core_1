package com.epam.aircompany.model.passenger;

import com.epam.aircompany.model.AbstractPassengerTransport;

public class HelicopterP extends AbstractPassengerTransport {
    private Integer numberOfScrews;

    public HelicopterP() {
    }

    public HelicopterP(Integer numberOfScrews) {
        this.numberOfScrews = numberOfScrews;
    }

    public Integer getNumberOfScrews() {
        return numberOfScrews;
    }

    public void setNumberOfScrews(Integer numberOfScrews) {
        this.numberOfScrews = numberOfScrews;
    }
}
