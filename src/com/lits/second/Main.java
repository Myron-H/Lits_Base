package com.lits.second;

import java.util.Scanner;

import static com.lits.second.Test.Polindrom;

public class Main {
    public static void main(String[] args) {
                     // Поліндром
        System.out.println("Завдання 1: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Веедіть слово для перевірки:" + str);

        if (Polindrom(str))    // Приймаємо результат з методу Polindrome і Виводимо в консоль
            System.out.println("Так, це поліндром");
        else
            System.out.println("Ні, це не поліндром");

                    //
        Test tst = new Test();
        tst.goo();
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
