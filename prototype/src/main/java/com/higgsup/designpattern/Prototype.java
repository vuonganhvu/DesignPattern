package com.higgsup.designpattern;

public interface Prototype extends Cloneable {

    AccessControl clone() throws CloneNotSupportedException;

}
