package com.epam.aircompany.service;

import com.epam.aircompany.model.AbstractAviaTechnique;
import com.epam.aircompany.model.AbstractFreightTransport;
import com.epam.aircompany.model.AbstractPassengerTransport;

import java.util.List;

public interface IСommonService {

    Double getCarryingCapacity(List<AbstractFreightTransport> transports);

    Integer getNumberOfPassengers(List<AbstractPassengerTransport> transports);

    List<AbstractAviaTechnique> sortingByRangeOfFlight(List<AbstractAviaTechnique> aviaTechniques);
}
