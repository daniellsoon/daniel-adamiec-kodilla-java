package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {


        Flight flight = new Flight("Warsaw", "Berlin");

        FlightFinder finder = new FlightFinder();


        try {
            finder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Cannot find this airport in DataBase!");
        }

        System.out.println("Please search again!");

    }

}
