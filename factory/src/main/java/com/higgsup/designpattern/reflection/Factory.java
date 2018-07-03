package com.higgsup.designpattern.reflection;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static Factory instance = new Factory();
    private Map<String, Class> mapSource = new HashMap<>();

    private Factory() {
    }

    public static Factory getInstance() {
        return instance;
    }

    public void registerProduct(Class clazz) {
        mapSource.put(clazz.getSimpleName(), clazz);
    }

    public Product createProduct(String nameClass) throws IllegalAccessException, InstantiationException {
        Class clazz = mapSource.get(nameClass);
        return (Product) clazz.newInstance();
    }
}
