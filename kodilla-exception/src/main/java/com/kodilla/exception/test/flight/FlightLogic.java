package com.kodilla.exception.test.flight;
import java.util.HashMap;
import java.util.Set;

public class FlightLogic {
    private static boolean checkIfExistsOnMap (Set<String> airportSet, String comparedAirport) {
        boolean isOnMap = airportSet.stream()
                .anyMatch(n -> n.equals(comparedAirport));
        System.out.println(comparedAirport + " exists on map: " + isOnMap);
        return isOnMap;
    }

    public final void findFlight(Flight flight) throws RouteNotFoundException {

        final HashMap<String, Boolean> availability = new HashMap<>();
        availability.put("Lodz", true);
        availability.put("Warsaw", true);
        availability.put("Berlin", true);
        availability.put("Prague", true);

        if (checkIfExistsOnMap(availability.keySet(), flight.arrivalAirport) && checkIfExistsOnMap(availability.keySet(), flight.departureAirport)) {
            System.out.println("Processing..");
        } else {
            throw new RouteNotFoundException("Cannot find airport on map");
        }
    }
    public static void main(String[] args) {

        FlightLogic flightSearch = new FlightLogic();

        try {
            flightSearch.findFlight(new Flight("Lodz", "Warsaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find your destination airport");
        }
    }
}