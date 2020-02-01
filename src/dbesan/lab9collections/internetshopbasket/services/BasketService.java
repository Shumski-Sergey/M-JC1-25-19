package dbesan.lab9collections.internetshopbasket.services;

import dbesan.lab9collections.internetshopbasket.services.impl.Basket;

import java.util.HashMap;
import java.util.Map;

public class BasketService implements Basket {
    private Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Map<String, Integer> getProducts() {
        return map;
    }

    @Override
    public int getProductQuantity(String product) {
        return map.get(product);
    }
}
