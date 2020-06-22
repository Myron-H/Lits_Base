package com.lits.hw5;

public class Bus extends Auto implements Automobile {

    // Конструктор Bus
    public Bus(String name, String model, int year) {
        super(name, model, year);
    }

    // Конструктор Bus
    public Bus() {
    }

    // Дані NEOPLAN і двигуна
    public void dataBusNeoplan() {

        // Створення NEOPLAN і двигуна
        Bus neoplan = new Bus("NEOPLAN", "Trendliner", 2020);
        Engine engineNeoplan = new Engine("LLO777", "gaz-gazoline", 12.6);

        // Вивід у консоль даних
        neoplan.dataAuto();
        engineNeoplan.dataEngine();
    }

    // Дані VOLVO і двигуна
    public void dataBusVolvo() {

        // Створення VOLVO і двигуна
        Bus volvo = new Bus("VOLVO", "Volvo 9900", 2018);
        Engine engineVolvo = new Engine("POK300", "electric", 10.9);

        // Вивід у консоль даних
        volvo.dataAuto();
        engineVolvo.dataEngine();
    }

    // Дані SETRA і двигуна
    public void dataBusSetra() {

        // Створення SETRA і двигуна
        Bus setra = new Bus("SETRA", "Kassbohrer", 2017);
        Engine engineSetra = new Engine("JJ890L", "gaz", 14.2);

        // Вивід у консоль даних
        setra.dataAuto();
        engineSetra.dataEngine();
    }

    // Дані IKARUS і двигуна
    public void dataBusIkarus() {

        // Створення IKARUS і двигуна
        Bus ikarus = new Bus("IKARUS", "Makador", 2019);
        Engine engineIkarus = new Engine("NMN033", "diesel", 10.2);

        // Вивід у консоль даних
        ikarus.dataAuto();
        engineIkarus.dataEngine();
    }
}