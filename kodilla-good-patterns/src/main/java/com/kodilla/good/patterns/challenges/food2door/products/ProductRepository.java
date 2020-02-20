package com.kodilla.good.patterns.challenges.food2door.products;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<Product, Integer> products = new HashMap<>();

    public void putProduct(Product product, Integer quantity) {
        products.put(product, quantity);
    }

    public int getQuantity(Product product) {
        return products.get(product);
    }

    public void setQuantity(Product product,Integer newQuantity) {
        products.replace(product, newQuantity);
    }

    public void checkAvailable(Product product) {
        Integer count = products.get(product);
        if (count != null && count > 0) {
            System.out.println(product);
        } else {
            throw new ProductNotFoundException();
        }
    }

}
