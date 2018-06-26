package com.higgsup.designpattern;

/**
 * Created by anhvu on 21-Jun-18.
 */
public class ShallowClone implements Cloneable {
    @Override
    public ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }
}
