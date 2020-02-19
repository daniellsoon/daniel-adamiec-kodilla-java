package com.kodilla.good.patterns.challenges.food2door.products;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException() {
        System.out.println("Cannot find product!");
    }
}
