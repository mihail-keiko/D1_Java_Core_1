package com.epam.aircompany.service.impl;

import com.epam.aircompany.model.AbstractAviaTechnique;
import com.epam.aircompany.model.AbstractFreightTransport;
import com.epam.aircompany.model.AbstractPassengerTransport;
import com.epam.aircompany.model.Airline;
import com.epam.aircompany.service.IСommonService;

import java.util.Arrays;
import java.util.List;

public class СommonService implements IСommonService {

    @Override
    public Double getCarryingCapacity(List<AbstractFreightTransport> transports) {

        Double result = Double.valueOf(0);
        for (AbstractFreightTransport item : transports) {
            result += item.getCarryingCapacity();
        }
        return result;
    }

    @Override
    public Integer getNumberOfPassengers(List<AbstractPassengerTransport> transports) {

        Integer result = 0;
        for (AbstractPassengerTransport item : transports) {
            result += item.getNumberOfSeats();
        }
        return result;
    }

    @Override
    public List<AbstractAviaTechnique> sortingByRangeOfFlight(List<AbstractAviaTechnique> aviaTechniques) {

        Arrays.sort(aviaTechniques.toArray());
        return aviaTechniques;
    }
}
