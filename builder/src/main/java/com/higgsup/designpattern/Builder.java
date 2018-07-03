package com.higgsup.designpattern;

public abstract class Builder {
    abstract Product build();

    abstract void buildField1(String field1);

    abstract void buildField2(String field2);
}
