package com.kodilla.good.patterns.challenges.service.controller.products;

public abstract class Product {

     private String productName;
     private double quantity;
     private boolean onStock;

    public Product(String productName, double quantity) {
        this.productName = productName;
        this.quantity = quantity;
        onStock = quantity > 0;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isOnStock() {
        return onStock;
    }
}
