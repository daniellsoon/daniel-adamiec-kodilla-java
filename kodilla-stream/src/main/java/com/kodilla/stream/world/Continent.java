package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> CountriesInContinent;

    public Continent() {
        CountriesInContinent = new ArrayList<>();

    }

    public void addCountry(Country country) {
        CountriesInContinent.add(country);
    }

    public List<Country> getCountriesInContinent() {
        return CountriesInContinent;
    }

}
