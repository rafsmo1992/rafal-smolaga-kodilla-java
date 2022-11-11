package com.kodilla.good.patterns.challenges.airlinefinder;

public class FlightConnections {
    public static void main(String[] args) {
        FlightRegister flightRegister = FlightRetriver.retrive();

        FlightSearchApp flightSearchApp = new FlightSearchApp(flightRegister.getListOfFlight());
        flightSearchApp.searchByCityForTransfer("Lódź", "Gdańsk", "Szczecin");
        flightSearchApp.searchByCityOfArrival("Katowice");
        flightSearchApp.searchByCityOfDeparture("Toruń");

    }
}