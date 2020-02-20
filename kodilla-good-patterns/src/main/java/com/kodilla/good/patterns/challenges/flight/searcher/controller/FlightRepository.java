package com.kodilla.good.patterns.challenges.flight.searcher.controller;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    private Set<Flight> flights = new HashSet<>();

    public Set<Flight> getFlights() {
        return flights;
    }

    public void fillRepository() {
        flights.add(new Flight("Berlin", "Warsaw"));
        flights.add(new Flight("Berlin", "Paris"));
        flights.add(new Flight("Berlin","Prague"));
        flights.add(new Flight("Paris", "Warsaw"));
        flights.add(new Flight("Prague", "Warsaw"));
        flights.add(new Flight("Bratislava","Warsaw"));
        flights.add(new Flight("Warsaw","Berlin"));
        flights.add(new Flight("Bratislava","Paris"));
        flights.add(new Flight("Warsaw","Bratislava"));
        flights.add(new Flight("Ankara","Paris"));
        flights.add(new Flight("Warsaw","Rotterdam"));
    }


}
