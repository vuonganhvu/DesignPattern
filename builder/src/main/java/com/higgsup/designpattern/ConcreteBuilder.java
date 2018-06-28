package com.higgsup.designpattern;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    Product build() {
        return product;
    }

    @Override
    void buildField1(String field1) {
         product.setField1(field1);
    }

    @Override
    void buildField2(String field2) {
         product.setField2(field2);
    }
}
