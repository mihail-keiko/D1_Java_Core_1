package com.epam.aircompany.model.freight;

import com.epam.aircompany.model.AbstractFreightTransport;

public class HelicopterF extends AbstractFreightTransport {
    private Integer numberOfScrews;

    public HelicopterF() {
    }

    public HelicopterF(Integer numberOfScrews) {
        this.numberOfScrews = numberOfScrews;
    }

    public Integer getNumberOfScrews() {
        return numberOfScrews;
    }

    public void setNumberOfScrews(Integer numberOfScrews) {
        this.numberOfScrews = numberOfScrews;
    }
}
