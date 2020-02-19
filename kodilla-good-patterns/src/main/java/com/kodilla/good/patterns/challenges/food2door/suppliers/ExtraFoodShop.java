package com.kodilla.good.patterns.challenges.food2door.suppliers;

        import com.kodilla.good.patterns.challenges.food2door.orderService.ProductDto;
        import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;

public class ExtraFoodShop extends Supplier {

    public ExtraFoodShop(String name, String factoryAddress) {
        super(name, factoryAddress);
    }

    @Override
    public boolean process(ProductDto productDto, ProductRepository productRepository) {
        if(stockUpdater(productDto, productRepository)) {
            System.out.println("SMS to supplier sent!");
            System.out.println("1...2...3...Puff!");
            System.out.println("Order Realized!");
            return true;
        } else {
            return false;
        }
    }
}
