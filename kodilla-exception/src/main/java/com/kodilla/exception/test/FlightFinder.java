package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        HashMap<String, Boolean> map = new HashMap<>();
        String exceptionTest = null;

         for (Map.Entry<String, Boolean> entry : map.entrySet()) {
             String k = entry.getKey();
             Boolean v = entry.getValue();

             if (k.equals(flight.getArrivalAirport())) {
                 exceptionTest = "Possibility of flights (true/false): ";
                 System.out.println(exceptionTest + v);
             }
         }

         if (exceptionTest == null) {
             throw new RouteNotFoundException();
         }
    }

}
