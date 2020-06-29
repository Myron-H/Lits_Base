package com.lits.hw6;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Завдання 1. Написати свою реалізацію для стеку. Вона має працювати з вашим кастомним ітератором
        System.out.println("Завдання 1");

        // Stack типу Integer
        Stack<Integer> myStack = new Stack<>();
        myStack.addElement(1);
        myStack.addElement(2);
        myStack.addElement(3);
        myStack.addElement(4);
        myStack.addElement(5);

        System.out.println("Список: ");
        // Перебирання списку
        myStack.forEach(s -> System.out.print(s.toString() + " "));
        System.out.println();

        // Кастомний ітератор
        CustomIterator myStackCheck = new CustomIterator<>(myStack);
        System.out.println("Елемент у початковому індексі: " + myStackCheck.firstIndex());
        System.out.println("Елемент кінцевого індексу: " + myStackCheck.lastIndex());

        System.out.println("Видалення початкового елементу");
        myStackCheck.removeFirst();
        myStackCheck.showList();
        System.out.println();

        System.out.println("Видалення кінцевого елементу");
        myStackCheck.removeLast();
        myStackCheck.showList();
        System.out.println();

        System.out.println("Видалення всіх елементів");
        myStackCheck.clear();
        myStackCheck.showList();

        // Завдання 2. Написати свою реалізацію для LinkedList
        System.out.println("Завдання 2");

        // LinkedList типу Strings
        List<String> list = new LinkedList<String>();
        list.add(0, "One");
        list.add(1, "Two");
        list.add(2, "Three");
        list.add(3, "Four");
        list.add(4, "Five");

        list.forEach(s -> System.out.print(s + " "));
        System.out.println("");
        // Вивід розміру стеку
        System.out.println(list.size());
        // Видалення по індексу
        list.remove(3);
        System.out.println(list.size());
        // Додавання по індексу і назві
        list.add(3, "newThree");
        System.out.println(list.size());

        // LinkedList типу Object
        LinkedList<Person> people = new LinkedList<Person>();
        // додавання елементу
        people.add(new Person("First"));
        // додавання першого елементу
        people.addFirst(new Person("Second"));
        // додавання останнього елементу
        people.addLast(new Person("Third"));
        // видалення по індексу
        people.remove(1);

        // показ список
        for (Person p : people) {
            System.out.println(p.getName());
        }
        // додавання елементу по індексу
        people.add(0, new Person("Five"));

        // перевірка на присутність по індексу елемента
        if (people.contains(people.get(1))) {
            System.out.println("В списку є елемент під індексом 1");
        }

        // вивід в консоль першого елемента
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}