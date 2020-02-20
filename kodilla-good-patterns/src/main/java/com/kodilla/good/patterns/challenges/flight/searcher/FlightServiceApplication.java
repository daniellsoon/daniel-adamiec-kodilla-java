package com.kodilla.good.patterns.challenges.flight.searcher;

import com.kodilla.good.patterns.challenges.flight.searcher.controller.FlightRepository;
import com.kodilla.good.patterns.challenges.flight.searcher.controller.SearchModes;

public class FlightServiceApplication {

    public static void main(String[] args) {

        SearchModes searchModes = new SearchModes();

        FlightRepository flightRepository = new FlightRepository();
        flightRepository.fillRepository();

        searchModes.flightsFromDeparture("Warsaw", flightRepository);
        searchModes.flightsToArrival("Paris", flightRepository);
        searchModes.flightsFormTo("Warsaw", "Paris", flightRepository);

    }
}
