package com.higgsup.designpattern.avoidReflection;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static Factory instance = new Factory();
    private Map<String, Product> mapSource = new HashMap<>();

    private Factory() {
    }

    public static Factory getInstance() {
        return instance;
    }

    public void registerProduct(Product product) {
        mapSource.put(product.getClass().getSimpleName(), product);
    }

    public Product createProduct(String nameClass) throws IllegalAccessException, InstantiationException {
        Product product = mapSource.get(nameClass);
        return product.createObject();
    }
}
