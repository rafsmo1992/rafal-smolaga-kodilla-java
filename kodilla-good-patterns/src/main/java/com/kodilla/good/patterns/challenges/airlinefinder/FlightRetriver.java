package com.kodilla.good.patterns.challenges.airlinefinder;


import java.util.List;

public class FlightRetriver {

    public static FlightRegister retrive() {

        Flight flight = new Flight("Lódź", "Gdańsk", 815);
        Flight flight1 = new Flight("Warszawa", "Kraków", 0011);
        Flight flight2 = new Flight("Poznań", "Rzeszów", 0243);
        Flight flight3 = new Flight("Katowice", "Kraków", 0145);
        Flight flight4 = new Flight("Toruń", "Białystok", 0004);
        Flight flight5 = new Flight("Poznań", "Szczecin", 3421);
        Flight flight6 = new Flight("Katowice", "Toruń", 8764);
        Flight flight7 = new Flight("Rzeszów", "Poznań", 4789);
        Flight flight8 = new Flight("Wrocław", "Rzeszów", 0043);
        Flight flight9 = new Flight("Gdańsk", "Katowice", 2455);
        Flight flight10 = new Flight("Toruń", "Poznań", 6534);
        Flight flight11 = new Flight("Białystok", "Rzeszów", 3456);
        Flight flight12 = new Flight("Lódź", "Warszawa", 3271);

        FlightRegister flightRegister = new FlightRegister();
        flightRegister.addFlight(flight);
        flightRegister.addFlight(flight1);
        flightRegister.addFlight(flight2);
        flightRegister.addFlight(flight3);
        flightRegister.addFlight(flight4);
        flightRegister.addFlight(flight5);
        flightRegister.addFlight(flight6);
        flightRegister.addFlight(flight7);
        flightRegister.addFlight(flight8);
        flightRegister.addFlight(flight9);
        flightRegister.addFlight(flight10);
        flightRegister.addFlight(flight11);

        return flightRegister;

    }
}