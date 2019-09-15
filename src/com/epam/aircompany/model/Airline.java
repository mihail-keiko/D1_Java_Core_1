package com.epam.aircompany.model;

import java.util.List;

public class Airline {
    private List<AbstractAviaTechnique> aviationPark;

    public Airline() {
    }

    public Airline(List<AbstractAviaTechnique> aviationPark) {
        this.aviationPark = aviationPark;
    }

    public List<AbstractAviaTechnique> getAviationPark() {
        return aviationPark;
    }

    public void setAviationPark(List<AbstractAviaTechnique> aviationPark) {
        this.aviationPark = aviationPark;
    }
}
