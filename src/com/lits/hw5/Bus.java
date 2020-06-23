package com.lits.hw5;

public class Bus extends Auto {

    // Конструктор Bus
    public Bus(String name, String model, int year, float weight, int maxspeed,
               int idEngine, String typeEngine, double powerEngine) {
        super(name, model, year, weight, maxspeed, idEngine, typeEngine, powerEngine);

    }

    // Конструктор Bus
    public Bus() {
    }

    // Дані NEOPLAN і двигуна
    public void dataBusNeoplan() {

        // Створення NEOPLAN і двигуна
        Bus neoplan = new Bus("NEOPLAN", "Trendliner", 2020, 22.500f, 110,
                500687, "diesel", 10.9);

        // Вивід у консоль даних
        neoplan.dataAuto();
    }

    // Дані VOLVO і двигуна
    public void dataBusVolvo() {

        // Створення VOLVO і двигуна
        Bus volvo = new Bus("VOLVO", "Volvo 9900", 2018, 21.300f, 90,
                544123, "gaz", 11.8);

        // Вивід у консоль даних
        volvo.dataAuto();
    }

    // Дані SETRA і двигуна
    public void dataBusSetra() {

        // Створення SETRA і двигуна
        Bus setra = new Bus("SETRA", "Kassbohrer", 2017, 21.400f, 120,
                900222, "gazoline", 10.9);

        // Вивід у консоль даних
        setra.dataAuto();
    }

    // Дані IKARUS і двигуна
    public void dataBusIkarus() {

        // Створення IKARUS і двигуна
        Bus ikarus = new Bus("IKARUS", "Makador", 2019, 22.000f, 100,
                555700, "gaz", 14.8);

        // Вивід у консоль даних
        ikarus.dataAuto();
    }
}