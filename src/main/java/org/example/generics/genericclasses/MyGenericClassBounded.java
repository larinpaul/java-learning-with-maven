package org.example.generics.genericclasses;

public class MyGenericClassBounded<T extends Number, V extends Number> {

    T x;
    V y;

    MyGenericClassBounded(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public V getValue() {
        return y;
    }

}
