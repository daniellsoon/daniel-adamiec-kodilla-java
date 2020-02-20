package com.kodilla.good.patterns.challenges.food2door;


import com.kodilla.good.patterns.challenges.food2door.orderService.OrderService;
import com.kodilla.good.patterns.challenges.food2door.orderService.ProductDto;
import com.kodilla.good.patterns.challenges.food2door.products.Product;
import com.kodilla.good.patterns.challenges.food2door.products.ProductNotFoundException;
import com.kodilla.good.patterns.challenges.food2door.products.ProductRepository;
import com.kodilla.good.patterns.challenges.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.suppliers.HealthyShop;

public class Food2doorApplication {

    public static void main(String[] args){

        OrderService orderService = new OrderService();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Extra Food Shop", "Cottage 17");
        HealthyShop healthyShop = new HealthyShop("Healthy Shop", "City 123");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Gluten Free Shop", "No Gluten 434");

        ProductRepository productRepository = new ProductRepository();

        Product eggs = new Product("Eggs", extraFoodShop);
        productRepository.putProduct(eggs, 10);
        Product bread = new Product("Bread", extraFoodShop);
        productRepository.putProduct(bread ,15);
        Product wheat = new Product("Wheat", extraFoodShop);
        productRepository.putProduct(wheat, 20);
        Product butter = new Product("Butter", healthyShop );
        productRepository.putProduct(butter ,10);
        Product cheese = new Product("Cheese", healthyShop);
        productRepository.putProduct(cheese, 20);
        Product dumplings = new Product("Dumplings", healthyShop);
        productRepository.putProduct(dumplings, 15);
        Product tomato = new Product("Tomato", glutenFreeShop);
        productRepository.putProduct(tomato, 10);
        Product cucumber = new Product("Cucumber", glutenFreeShop);
        productRepository.putProduct(cucumber, 15);
        Product maize = new Product("Maize", glutenFreeShop);
        productRepository.putProduct(maize, 0);




        ProductDto order1 = new ProductDto(eggs, 10);
        orderService.orderProcess(order1, productRepository);

        ProductDto order2 = new ProductDto(cheese, 30 );
        orderService.orderProcess(order2, productRepository);

        try {
            ProductDto orderError = new ProductDto(maize, 10);
            orderService.orderProcess(orderError, productRepository);
        } catch(ProductNotFoundException e) {
            System.out.println("Error!");
        }
    }
}
