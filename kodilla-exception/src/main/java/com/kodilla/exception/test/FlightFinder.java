package com.kodilla.exception.test;

        import java.util.HashMap;
        import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        HashMap<String, Boolean> map = new HashMap<>();
        map.put("Warsaw", false);
        map.put("Paris", false);
        map.put("Moscow", false);
        map.put("Madrid", true);
        map.put("Belgrade", true);


        Boolean isArrivalAirport = map.get(flight.getArrivalAirport());
        Boolean isDepartureAirport = map.get(flight.getDepartureAirport());


        if(isArrivalAirport == null || isDepartureAirport == null) {
            throw new RouteNotFoundException();
        }

        if(isDepartureAirport == false) {
            throw new RouteNotFoundException();
        }

    }

}
