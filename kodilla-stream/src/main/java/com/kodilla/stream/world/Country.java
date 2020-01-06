package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String countryName;
    private String peopleQuantity;

    public Country(String countryName, String peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal newPeopleInCountry = new BigDecimal(peopleQuantity);
        return newPeopleInCountry;
    }

}
