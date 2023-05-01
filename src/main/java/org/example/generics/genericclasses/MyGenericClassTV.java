package org.example.generics.genericclasses;

public class MyGenericClassTV<T, V> {

    T x;
    V y;

    MyGenericClassTV(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public V getValue() {
        return y;
    }

}
