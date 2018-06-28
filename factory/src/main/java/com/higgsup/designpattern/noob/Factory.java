package com.higgsup.designpattern.noob;

public class Factory {
    public Product createProduct(String nameClass) {
        if("product1".equals(nameClass)){
            return new ConcreteProduct1();
        } else if ("product2".equals(nameClass)) {
            return new ConcreteProduct2();
        }
        return null;
    }
}
