package com.lits.hw5;

public class Bus extends Auto {

    // Конструктор Bus
    public Bus(String name, String model, int year, float weight, int maxspeed) {
        super(name, model, year, weight, maxspeed);

    }

    // Конструктор Bus
    public Bus() {
    }

    // Дані NEOPLAN і двигуна
    public void dataBusNeoplan() {

        // Створення NEOPLAN і двигуна
        Bus neoplan = new Bus("NEOPLAN", "Trendliner", 2020, 22.500f, 110);

        // Вивід у консоль даних
        neoplan.dataAuto();
    }

    // Дані VOLVO і двигуна
    public void dataBusVolvo() {

        // Створення VOLVO і двигуна
        Bus volvo = new Bus("VOLVO", "Volvo 9900", 2018, 21.300f, 90);

        // Вивід у консоль даних
        volvo.dataAuto();
    }

    // Дані SETRA і двигуна
    public void dataBusSetra() {

        // Створення SETRA і двигуна
        Bus setra = new Bus("SETRA", "Kassbohrer", 2017, 21.400f, 120);

        // Вивід у консоль даних
        setra.dataAuto();
    }

    // Дані IKARUS і двигуна
    public void dataBusIkarus() {

        // Створення IKARUS і двигуна
        Bus ikarus = new Bus("IKARUS", "Makador", 2019, 22.000f, 100);

        // Вивід у консоль даних
        ikarus.dataAuto();
    }
}