package com.lits.hw5;

public class Truck extends Auto {

    // Конструктор Truck
    public Truck(String name, String model, int year, float weight, int maxspeed) {
        super(name, model, year, weight, maxspeed);
    }

    // Конструктор Truck
    public Truck() {
    }

    // Дані MAN і двигуна
    public void dataTruckMan() {

        // Створення MAN і двигуна
        Truck man = new Truck("MAN", "Welly", 2017, 28.500f, 120);

        // Вивід у консоль даних
        man.dataAuto();
    }

    // Дані SCANIA і двигуна
    public void dataTruckScania() {

        // Створення SCANIA і двигуна
        Truck scania = new Truck("SCANIA", "Century", 2019, 26000, 110);

        // Вивід у консоль даних
        scania.dataAuto();
    }

    // Дані RENAULT і двигуна
    public void dataTruckRenault() {

        // Створення RENAULT і двигуна
        Truck renault = new Truck("RENAULT", "Marius", 2018, 29000, 130);

        // Вивід у консоль даних
        renault.dataAuto();
    }

    // Дані DAF і двигуна
    public void dataTruckDaf() {

        // Створення DAF і двигуна
        Truck daf = new Truck("DAF", "XF900", 2018, 25.400f, 100);

        // Вивід у консоль даних
        daf.dataAuto();
    }
}