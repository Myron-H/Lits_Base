package com.lits.hw3;

public class Main {
    public static void main(String[] args) {

        // Дані ракети
        System.out.println("Ракета: " + SpaceX.name + " компанії " + SpaceX.nameCompany);
        System.out.println("Місія: " + SpaceX.mission + " ,дистанція: " + SpaceX.distance + " km");
        System.out.println("Параметри: Висота " + SpaceX.height + " метрів " + "Вага " + SpaceX.weight + " кг");

        // Створюємо екіпаж
        System.out.println("Екіпаж: ");
        People.crewPeople();

        // Таймер зворотнього відліку
        int[] timer = {1, 2, 3, 4, 5};
        for (int i = timer.length; i >= 1; i--) {
            System.out.println("Відлік часу: " + i);
        }
        System.out.println("Старт!!!");

        // Полетіли у космос
        SpaceX.goSpace();

        // Розраховуємо чи хватить палива до МКС, якщо так то летимо на МКС
        SpaceX.mileage();

    }

    // МКС
    public static void goMKS() {

        System.out.println("... Космічний корабель " + SpaceX.name + " компанії " +
                SpaceX.nameCompany + " успішно зістикувався з МКС");
    }
}
