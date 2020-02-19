package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderService.ProductDto;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public abstract class Supplier {

    private String name;
    private String factoryAddress;


    public Supplier(String name, String factoryAddress) {
        this.name = name;
        this.factoryAddress = factoryAddress;

    }

    public boolean stockUpdater(ProductDto productDto, ProductRepository productRepository) {
        productRepository.checkAvailable(productDto.getProduct());
        if (productDto.getOrderedCount() <= productRepository.getQuantity(productDto.getProduct())) {
            int newCount = productRepository.getQuantity(productDto.getProduct()) - productDto.getOrderedCount();
            productRepository.setQuantity(productDto.getProduct(), newCount);
            return true;
        } else {
            System.out.println("Not enough product!");
            return false;
        }
    }


        public abstract boolean process (ProductDto productDto, ProductRepository productRepository);
    }

