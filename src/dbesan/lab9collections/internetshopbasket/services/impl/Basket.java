package dbesan.lab9collections.internetshopbasket.services.impl;

import java.util.Map;

public interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    Map<String, Integer> getProducts();

    int getProductQuantity(String product);
}
