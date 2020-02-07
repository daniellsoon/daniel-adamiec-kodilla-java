package com.kodilla.good.patterns.challenges.service.controller;

import com.kodilla.good.patterns.challenges.service.controller.products.Product;

import java.time.LocalDate;

public class SellRequest {

    private User user;
    private LocalDate dateOfOrder;
    private String deliveryAddress;
    private Product product;
    private boolean onStock;

    public SellRequest(User user, LocalDate dateOfOrder, String deliveryAddress, Product product) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.deliveryAddress = deliveryAddress;
        this.product = product;
        this.onStock = this.product.isOnStock();
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Product getProduct() { return product; }

    public boolean onStock() {
        return onStock;
    }

}
