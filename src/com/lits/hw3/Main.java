package com.lits.hw3;

/*
 * Домашнє завдання 15.06.2020
 */
public class Main {

    public static void main(String[] args) {

        // Центр управління
        SpaceCenter spaceCenter = new SpaceCenter();
        System.out.println("Центр управління " + spaceCenter.getNameCenter());

        // Ракета
        SpaceX spaceX = new SpaceX();
        spaceX.dataSpaceX();

        // Статус ракети
        System.out.println("Статус ракети: " + Status.STOP);

        // Екіпаж
        People people = new People();
        people.dataPeople();

        // Підготовка до старту
        spaceCenter.start();

        // Полетіли у космос
        spaceX.goSpace();

        // Розраховуємо чи хватить палива до МКС, якщо так то летимо на МКС
        spaceX.distanceMks();

    }
}
