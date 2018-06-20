package com.higgsup.designpattern.prototype;

public interface Prototype extends Cloneable {

    AccessControl clone() throws CloneNotSupportedException;

}
