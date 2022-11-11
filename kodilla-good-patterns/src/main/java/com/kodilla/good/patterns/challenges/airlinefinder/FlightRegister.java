package com.kodilla.good.patterns.challenges.airlinefinder;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


public class FlightRegister {
    private Set<Flight> listOfFlight = new HashSet<Flight>();


    public boolean addFlight(Flight flight) {
        listOfFlight.add(flight);
        return true;
    }

    public Set<Flight> getListOfFlight() {
        return Collections.unmodifiableSet(listOfFlight);
    }
}