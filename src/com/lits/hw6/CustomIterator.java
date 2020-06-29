package com.lits.hw6;

import java.util.Stack;

public class CustomIterator<T> {

    private Stack<T> data;
    private int i = 0;

    public CustomIterator(Stack<T> data) {
        this.data = data;
    }

    // Видалення першого елементу
    public void removeFirst() {
        data.remove(i);
    }

    // Елемент кінцевого індексу
    public T lastIndex() {
        return data.get(data.size() - 1);
    }

    // Елемент у початковому індексі
    public T firstIndex() {
        return data.get(0);
    }

    // Видалення кінцевого елементу
    public void removeLast() {
        data.remove(data.size() - 1);
    }

    // Видалення списку
    public void clear() {
        data.clear();
    }

    // Показати список
    public void showList() {
        data.forEach(s -> System.out.print(s+" "));
    }
}
