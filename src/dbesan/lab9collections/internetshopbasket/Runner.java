package dbesan.lab9collections.internetshopbasket;

import dbesan.lab9collections.internetshopbasket.services.BasketService;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        BasketService BasketService = new BasketService();
        BasketService.addProduct("Телефон", 2);
        BasketService.addProduct("Телевизор", 3);
        BasketService.addProduct("Ноутбук", 5);
        System.out.println(BasketService.getProducts());
        BasketService.updateProductQuantity("Телевизор", 4);
        System.out.println(BasketService.getProducts());
        BasketService.removeProduct("Ноутбук");
        System.out.println(BasketService.getProducts());
        System.out.println(BasketService.getProductQuantity("Телевизор"));
        BasketService.clear();
    }
}







