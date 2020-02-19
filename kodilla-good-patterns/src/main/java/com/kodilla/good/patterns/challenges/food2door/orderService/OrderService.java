package com.kodilla.good.patterns.challenges.food2door.orderService;

import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class OrderService {

    public boolean orderProcess(ProductDto productDto, ProductRepository productRepository) {
            return productDto.getSupplier().process(productDto, productRepository);

    }

}
