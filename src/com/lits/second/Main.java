package com.lits.second;

import static com.lits.second.WorkClass.Polindrom;

public class Main {
    public static void main(String[] args) {
        // Поліндром
        System.out.println("Завдання 1: ");
        String str = "заказ";
        System.out.println("заказ");

        if (Polindrom(str))    // Приймаємо результат з методу Polindrome і виводимо в консоль
            System.out.println("Так, це слово поліндром");
        else
            System.out.println("Ні, це слово не поліндром");

        // Методи
        WorkClass tst = new WorkClass();
        tst.ArrayReverse();
        System.out.println(" ");
        System.out.println("Завдання 3: ");
        Zoo zoo = new Zoo();
        zoo.zo();
        zoo.oleg.say();
        zoo.max.say();
        zoo.cat.sayAnimal("Мурка", 8, "персицька");
        zoo.dog.sayAnimal("Рекс", 12, "доберман");

    }

}
