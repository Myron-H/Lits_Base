package com.lits.hw5;

public class Truck extends Auto {

    // Конструктор Truck
    public Truck(String name, String model, int year, float weight, int maxspeed,
                 int idEngine, String typeEngine, double powerEngine) {
        super(name, model, year, weight, maxspeed, idEngine, typeEngine, powerEngine);
    }

    // Конструктор Truck
    public Truck() {
    }

    // Дані MAN і двигуна
    public void dataTruckMan() {

        // Створення MAN і двигуна
        Truck man = new Truck("MAN", "Welly", 2017, 28.500f, 120,
                125638, "diesel", 14.6);

        // Вивід у консоль даних
        man.dataAuto();
    }

    // Дані SCANIA і двигуна
    public void dataTruckScania() {

        // Створення SCANIA і двигуна
        Truck scania = new Truck("SCANIA", "Century", 2019, 26000, 110,
                565289, "gaz", 14.8);

        // Вивід у консоль даних
        scania.dataAuto();
    }

    // Дані RENAULT і двигуна
    public void dataTruckRenault() {

        // Створення RENAULT і двигуна
        Truck renault = new Truck("RENAULT", "Marius", 2018, 29000, 130,
                258600, "diesel", 12.6);

        // Вивід у консоль даних
        renault.dataAuto();
    }

    // Дані DAF і двигуна
    public void dataTruckDaf() {

        // Створення DAF і двигуна
        Truck daf = new Truck("DAF", "XF900", 2018, 25.400f, 100,
                256344, "diesel", 12.6);

        // Вивід у консоль даних
        daf.dataAuto();
    }
}