package riliuchik.lab7_collections.prezentationCollections.Online_shop;

import java.util.LinkedHashMap;

interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    LinkedHashMap<String, Integer> getProducts();

    int getProductQuantity(String product);
}