package riliuchik.lab7_collections.prezentationCollections.Online_shop;

import java.util.Map;

/**
 * Реализовать класс корзины интернет магазина.
 */

public class Online_shop {
    public static void main(String[] args) {
        Shopping goods = new Shopping();
        goods.addProduct("iPhone 7", 1);
        goods.addProduct("iPhone 8", 1);
        goods.addProduct("iPhone X", 1);
        goods.addProduct("iPhone Xs", 2);
        goods.addProduct("iPhone 11", 1);
        goods.addProduct("iPhone 11 Pro", 2);
        System.out.println("В корзине:");
        print(goods);
        goods.getProductQuantityForPrint("iPhone 11 Pro");
        goods.removeProduct("iPhone 7");
        System.out.println("\nВ корзине:");
        print(goods);
        goods.updateProductQuantity("iPhone 8", 2);
        System.out.println("\nВ корзине:");
        print(goods);
        goods.clear();
    }

    static void print(Shopping goods) {
        for (Map.Entry<String, Integer> entry : goods.getProducts().entrySet()) {
            System.out.printf("%s в количестве %d шт.%n", entry.getKey(), entry.getValue());
        }
    }
}