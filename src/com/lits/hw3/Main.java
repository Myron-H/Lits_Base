package com.lits.hw3;

public class Main {

    public static void main(String[] args) {

        // Створюємо ракету
        SpaceX spaceX = new SpaceX();

        // Дані ракети
        System.out.println("Ракета: " + SpaceX.name + " компанії " + SpaceX.nameCompany);
        System.out.println("Місія: " + SpaceX.mission + " ,дистанція: " + spaceX.distance + " km");
        System.out.println("Параметри: Висота " + spaceX.height + " метрів " + "Вага " + spaceX.weight + " кг");

        // Створюємо екіпаж і передаємо дані у метод sayPeople
        System.out.println("Екіпаж: ");
        People max = new People("Max", 53, "командир");
        max.sayPeople("Max", 53, "командир");
        People jone = new People("Jone", 49, "пілот");
        jone.sayPeople("Jone", 49, "пілот");

        // Таймер зворотнього відліку
        int[] timer = {1, 2, 3, 4, 5};
        for (int i = timer.length; i >= 1; i--) {
            System.out.println("Відлік часу: " + i);
        }
        System.out.println("Старт!!!");

        // Полетіли у космос
        spaceX.goSpace();

        // Розраховуємо чи хватить палива до МКС, якщо так то летимо на МКС
        spaceX.mileage();
    }

}
