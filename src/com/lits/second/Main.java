package com.lits.second;

public class Main {
    public static void main(String[] args) {
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
