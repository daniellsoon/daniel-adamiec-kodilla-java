package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderService.ProductDto;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class GlutenFreeShop extends Supplier {

    public GlutenFreeShop(String name, String factoryAddress) {
        super(name, factoryAddress);
    }

    @Override
    public boolean process(ProductDto productDto, ProductRepository productRepository) {

        if(stockUpdater(productDto, productRepository)) {
            System.out.println("EMAIL to supplier sent!");
            System.out.println("5...4...3...2...1...BOOM!");
            System.out.println("Order Realized!");
            return true;
        } else {
            return false;
        }
    }
}
