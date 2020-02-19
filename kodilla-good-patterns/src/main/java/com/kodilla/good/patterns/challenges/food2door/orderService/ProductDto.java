package com.kodilla.good.patterns.challenges.food2door.orderService;

import com.kodilla.good.patterns.challenges.food2door.products.Product;
import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class ProductDto {

    private Product product;
    private int orderedCount;
    private Supplier supplier;

    public ProductDto (final Product product, final int orderedCount) {

        this.product = product;
        this.orderedCount = orderedCount;
        this.supplier = product.getSupplier();
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderedCount() {
        return orderedCount;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
