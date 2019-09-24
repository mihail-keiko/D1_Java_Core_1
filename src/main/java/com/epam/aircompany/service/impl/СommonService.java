package com.epam.aircompany.service.impl;

import com.epam.aircompany.model.AbstractAviaTechnique;
import com.epam.aircompany.model.AbstractFreightTransport;
import com.epam.aircompany.model.AbstractPassengerTransport;
import com.epam.aircompany.service.IСommonService;

import java.util.Arrays;
import java.util.List;

public class СommonService implements IСommonService {

    @Override
    public Double getCarryingCapacity(List<AbstractFreightTransport> transports) {

        Double result = Double.valueOf(0);
        if (transports != null || !transports.isEmpty()) {
            for (AbstractFreightTransport item : transports) {
                result += item.getCarryingCapacity();
            }
        } else {
            throw new NullPointerException("List transports cannot be null !");
        }
        return result;
    }

    @Override
    public Integer getNumberOfPassengers(List<AbstractPassengerTransport> transports) {

        Integer result = 0;
        if (transports != null || !transports.isEmpty()) {
            for (AbstractPassengerTransport item : transports) {
                result += item.getNumberOfSeats();
            }
        } else {
            throw new NullPointerException("List transports cannot be null !");
        }
        return result;
    }

    @Override
    public List<AbstractAviaTechnique> sortingByRangeOfFlight(List<AbstractAviaTechnique> aviaTechniques) {

        if (aviaTechniques != null || !aviaTechniques.isEmpty()) {
            Arrays.sort(aviaTechniques.toArray());
            return aviaTechniques;
        } else {
            throw new NullPointerException("List aviaTechniques cannot be null !");
        }
        return aviaTechniques;
    }
}
