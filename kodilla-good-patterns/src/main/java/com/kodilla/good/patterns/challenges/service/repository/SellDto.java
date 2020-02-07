package com.kodilla.good.patterns.challenges.service.repository;

import com.kodilla.good.patterns.challenges.service.controller.products.Product;
import com.kodilla.good.patterns.challenges.service.controller.User;

public class SellDto {

    public User user;
    public boolean isSold;
    public Product product;

    public SellDto(User user, Product product, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
        this.product = product;

    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }

    public Product getProduct() {
        return product;
    }

}
