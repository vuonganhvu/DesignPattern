package com.higgsup.designpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonSerializable implements Serializable {

    private static final long serialVersionUID = -1093810940935189395L;
    private static SingletonSerializable sc = new SingletonSerializable();
    private String name;

    private SingletonSerializable() {
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
        this.name = "SingletonSerializable";
    }

    public static SingletonSerializable getInstance() {
        return sc;
    }

    private Object readResolve() throws ObjectStreamException {
        return sc;
    }

    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("SingletonSerializable, cannot be clonned");
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null)
            classLoader = SingletonSerializable.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }

    public String getName() {
        return name;
    }
}
