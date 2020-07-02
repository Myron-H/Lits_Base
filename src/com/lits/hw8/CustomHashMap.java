package com.lits.hw8;

public interface CustomHashMap<K, V> {

    boolean isEmpty();

    int size();

    boolean containsKey(Object k);

    V get(Object k);

    void put(K k, V v);

    void delete(Object k);
}
