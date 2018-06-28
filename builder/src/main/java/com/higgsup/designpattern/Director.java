package com.higgsup.designpattern;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product constructorBuilder() {
        builder.buildField1("Field1");
        builder.buildField2("Field2");
        return builder.build();
    }
}
