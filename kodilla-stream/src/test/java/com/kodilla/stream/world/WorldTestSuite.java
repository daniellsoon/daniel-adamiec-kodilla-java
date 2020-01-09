package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetSandBeansQuantity() {

        //Given
        Country countryEurope1 = new Country("C1E", new BigDecimal ("123456789"));
        Country countryEurope2 = new Country("C2E", new BigDecimal ("789456123"));
        Country countryEurope3 = new Country("C3E", new BigDecimal ("741258963"));

        Continent europe = new Continent();
        europe.addCountry(countryEurope1);
        europe.addCountry(countryEurope2);
        europe.addCountry(countryEurope3);

        Country countryAsia1 = new Country("C1A", new BigDecimal ("147852369"));
        Country countryAsia2 = new Country("C2A", new BigDecimal ("987521463"));
        Country countryAsia3 = new Country("C3A", new BigDecimal ("741258963"));

        Continent asia = new Continent();
        asia.addCountry(countryAsia1);
        asia.addCountry(countryAsia2);
        asia.addCountry(countryAsia3);

        Country countryAmerica1 = new Country("C1A", new BigDecimal ("987321456"));
        Country countryAmerica2 = new Country("C2A", new BigDecimal ("951738426"));
        Country countryAmerica3 = new Country("C3A", new BigDecimal ("123987456"));

        Continent america = new Continent();
        america.addCountry(countryAmerica1);
        america.addCountry(countryAmerica2);
        america.addCountry(countryAmerica3);

        World world = new World();
        world.addContinent(america);
        world.addContinent(asia);
        world.addContinent(europe);

        //When
        BigDecimal peopleInWorld = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeoples = new BigDecimal("5593852008");
        Assert.assertEquals(expectedPeoples, peopleInWorld);


    }
}

