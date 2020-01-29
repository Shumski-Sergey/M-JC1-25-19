package riliuchik.lab7_collections.from_prezentationCollections.Online_shop;

import java.util.LinkedHashMap;

class Shopping implements Basket {
    private LinkedHashMap<String, Integer> commodity = new LinkedHashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        commodity.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        commodity.remove(product);
        System.out.printf("%n%s удален из корзины\n", product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        commodity.put(product, quantity);
        System.out.printf("%nКоличество %s изменено: %d шт.\n", product, quantity);
    }

    @Override
    public void clear() {
        commodity.clear();
        System.out.print("\nЗаказ оформлен. Корзина пуста.");
    }

    @Override
    public LinkedHashMap<String, Integer> getProducts() {
        return commodity;
    }

    @Override
    public int getProductQuantity(String product) {
        return commodity.get(product);
    }

    void getProductQuantityForPrint(String product) {
        System.out.printf("\nВ корзине находится %s в количестве %d шт.\n", product, getProductQuantity(product));
    }
}