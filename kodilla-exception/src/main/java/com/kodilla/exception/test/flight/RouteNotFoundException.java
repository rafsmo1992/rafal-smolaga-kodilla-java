package com.kodilla.exception.test.flight;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(String info) {
        super(info);
    }
}