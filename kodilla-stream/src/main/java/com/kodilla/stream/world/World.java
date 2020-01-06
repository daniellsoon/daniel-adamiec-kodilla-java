package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> cointinentsInWorld;

    public World() {
        cointinentsInWorld = new ArrayList<>();
    }

    public void addContinent(Continent continent) {
        cointinentsInWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = cointinentsInWorld.stream()
                .flatMap(continent -> continent.getCountriesInContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current ) -> sum = sum.add(current));
        return totalPeople;
    }


}
