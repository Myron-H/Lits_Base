package com.lits.hw7;

public interface Linked<E> {
    void addFirst(E e);

    void addLast(E e);

    int size();

    E getIndex(int index);
}
