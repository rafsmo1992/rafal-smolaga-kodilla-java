package com.kodilla.good.patterns.challenges.airlinefinder;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchApp {
    private Set<Flight> listOfFlight;

    public FlightSearchApp(Set<Flight> listOfFlight) {
        this.listOfFlight = listOfFlight;
    }

    public void searchByCityOfDeparture(String nameOfCityDeparture) {
        System.out.println("--------------");
        System.out.println("List flight from: " + nameOfCityDeparture);
        listOfFlight.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityOfArrival(String nameOfCityArrival) {
        System.out.println("--------------");
        System.out.println("List flight to: " + nameOfCityArrival);
        listOfFlight.stream()
                .filter(f -> f.getCityArrival().equals(nameOfCityArrival))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityForTransfer(String nameOfCityDeparture, String nameOfCityIntercharge, String nameOfCityArrival) {
        System.out.println("List flight from: " + nameOfCityDeparture + " to: " + nameOfCityArrival + " across: " + nameOfCityIntercharge);
        List<Flight> listOfFlightWithIntercharge = listOfFlight.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture) && f.getCityArrival().equals(nameOfCityIntercharge))
                .collect(Collectors.toList());
        listOfFlight.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityIntercharge) && f.getCityArrival().equals(nameOfCityArrival))
                .collect(Collectors.toCollection(() -> listOfFlightWithIntercharge));
        listOfFlightWithIntercharge.stream()
                .forEach(System.out::println);
    }
}
