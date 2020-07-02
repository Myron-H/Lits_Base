package com.lits.hw8;

import java.util.Objects;

public class MyHashMap<K, V> implements CustomHashMap<K, V> {

    private static final int initialCapacity = 1 << 4;
    private Entry<K, V>[] entries;
    private int size = 0;
    private double loadFactor = 0.75;
    private int capacity = initialCapacity;

    public MyHashMap() {
        this(initialCapacity);
    }

    public MyHashMap(int size) {
        this.capacity = size;
        entries = new Entry[size];
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(Object k) {
        return get(k) != null;
    }

    @Override
    public V get(Object k) {
        if (k == null) {
            return entries[0].value;
        }
        int pos = hash(k);
        Entry<K, V> entry = entries[pos];
        if (entry == null) {
            return null;
        }

        while (entry.next != null && !Objects.equals(entry.key, k)) {
            entry = entry.next;
        }

        if (Objects.equals(entry.key, k)) {
            return entry.value;
        }

        return null;
    }

    private int hash(Object k) {
        return Objects.hash(k) % entries.length;
    }

    @Override
    public void put(K k, V v) {

        Entry entry = new Entry(k, v, null);

        if (k == null) {
            Entry nullEntry = entries[0];
            if (nullEntry != null) {
                entry.next = nullEntry;
                entries[0] = entry;
            } else {
                entries[0] = entry;
                size++;
            }
            return;
        }

        int pos = hash(k);
        if (putInternal(entry, entries, pos) != null) {
            size++;
        }

    }

    private V putInternal(Entry<K, V> entry, Entry[] entries, int pos) {
        Entry<K, V> existing = entries[pos];
        if (existing != null) {

            if (Objects.equals(existing.key, entry.key)) {
                existing.value = entry.value;
            } else {
                Entry tmp = existing.next;
                entry.next = tmp;
                existing.next = entry;
            }
        } else {
            entries[pos] = entry;
        }

        return entry.value;
    }


    @Override
    public void delete(Object k) {
        int pos = hash(k);
        Entry<K, V> entry = entries[pos];
        if (entry == null) return;

        if (Objects.equals(entry.key, k)) {

            if (entry.next != null) {
                Entry<K, V> tmp = entry.next;
                while (tmp != null) {
                    put(tmp.key, tmp.value);
                    tmp = tmp.next;
                }
            }

            entries[pos] = null;
            size--;
            return;
        }

        Entry<K, V> head = entry.next;
        Entry<K, V> parent = entry;

        while (head != null) {
            if (Objects.equals(head.key, k)) {
                // re attach nodes
                parent.next = head.next;
                size--;
                return;
            }
            parent = head;
            head = head.next;
        }

    }
}

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }


    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }
}


