package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.service.ProductOrderService;
import com.kodilla.good.patterns.challenges.service.controller.products.Glue;
import com.kodilla.good.patterns.challenges.service.controller.SellRequest;
import com.kodilla.good.patterns.challenges.service.controller.User;
import com.kodilla.good.patterns.challenges.service.information.MailService;
import com.kodilla.good.patterns.challenges.service.repository.SellRepository;
import com.kodilla.good.patterns.challenges.service.selling.DanSellService;

import java.time.LocalDate;

public class ProductOrderServiceApplication {

    public static void main(String[] args){

    User user = new User("John", "Kowalsky");
    Glue glue = new Glue("Glue", 15);

    ProductOrderService productOrderService = new ProductOrderService(new MailService(), new DanSellService(), new SellRepository());

    productOrderService.process(new SellRequest(user, LocalDate.now(), "Warsaw, Street 12/20", glue));

    }
}
