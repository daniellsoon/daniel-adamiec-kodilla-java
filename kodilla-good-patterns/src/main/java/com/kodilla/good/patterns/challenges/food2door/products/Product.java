package com.kodilla.good.patterns.challenges.food2door.products;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class Product {

    private String name;
    private Supplier supplier;

    public Product(String name, Supplier supplier) {
        this.name = name;
        this.supplier = supplier;
    }


    public String getName() {
        return name;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
