package com.kodilla.good.patterns.challenges.service.selling;

import com.kodilla.good.patterns.challenges.service.controller.products.Product;
import com.kodilla.good.patterns.challenges.service.controller.User;

import java.time.LocalDate;

public class DanSellService implements SellService {


    @Override
    public boolean sell(User user, LocalDate dateOfOrder, String deliveryAddress, Product product) {
        return product.isOnStock();
    }
}
