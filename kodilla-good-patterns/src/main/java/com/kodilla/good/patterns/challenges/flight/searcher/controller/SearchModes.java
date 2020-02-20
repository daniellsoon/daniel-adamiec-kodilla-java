package com.kodilla.good.patterns.challenges.flight.searcher.controller;

import java.util.List;
import java.util.stream.Collectors;

public class SearchModes {

    public void flightsFromDeparture(String departure, FlightRepository flightRepository) {
        System.out.println("All flights form "+ departure+" :");
        flightRepository.getFlights().stream()
                .filter(e -> e.getDeparture().equals(departure))
                .forEach(e-> System.out.println(e.getArrival()));
        System.out.println("");
    }

    public void flightsToArrival(String arrival, FlightRepository flightRepository) {
        System.out.println("All flights to "+ arrival+" :");
        flightRepository.getFlights().stream()
                .filter(e -> e.getArrival().equals(arrival))
                .forEach(e-> System.out.println(e.getDeparture()));
        System.out.println("");
    }

    public void flightsFormTo(String departure, String arrival, FlightRepository flightRepository) {
        List<Flight> toStopover= flightRepository.getFlights().stream()
                .filter(e -> e.getDeparture().equals(departure))
                .collect(Collectors.toList());
        List<Flight> toArrival= flightRepository.getFlights().stream()
                .filter(e -> e.getArrival().equals(arrival))
                .collect(Collectors.toList());
        System.out.println("From " + departure + " to " + arrival + " you can flight with this stepovers: ");

        List<Flight> fromTo = null;
        for (Flight theStopover : toStopover) {
            for (Flight theFlight : toArrival)
                if (theStopover.getArrival().equals(theFlight.getDeparture())) {
                    System.out.println(theStopover.getArrival());
                }
        }
    }

}
