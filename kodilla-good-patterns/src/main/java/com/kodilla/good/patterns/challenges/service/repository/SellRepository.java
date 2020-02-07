package com.kodilla.good.patterns.challenges.service.repository;

import com.kodilla.good.patterns.challenges.service.controller.products.Product;
import com.kodilla.good.patterns.challenges.service.controller.User;

import java.time.LocalDate;

public class SellRepository implements Repository {


    @Override
    public boolean createRental(User user, Product product, LocalDate dateOfOrder, String deliveryAddress) {
        return true;
    }
}
