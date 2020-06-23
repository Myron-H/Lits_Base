package com.lits.hw5;

public class Bus extends Auto {

    private float weight;
    private int maxSpeed;
    // Двигун Bus
    private Engine engine;

    // Конструктор Bus
    public Bus(String name, String model, int year, float weight, int maxSpeed) {
        super(name, model, year);
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    // Конструктор Bus
    public Bus() {
    }

    // Дані NEOPLAN і двигуна
    public void dataBusNeoplan() {

        // Створення NEOPLAN і двигуна
        Bus neoplan = new Bus("NEOPLAN", "Trendliner", 2020,22.600f,110);
        Engine engineNeoplan = new Engine("LLO777", "gaz-gazoline", 12.6);

        // Вивід у консоль даних
        neoplan.dataAuto();
        engineNeoplan.dataEngine();
    }

    // Дані VOLVO і двигуна
    public void dataBusVolvo() {

        // Створення VOLVO і двигуна
        Bus volvo = new Bus("VOLVO", "Volvo 9900", 2018,21.300f,90);
        Engine engineVolvo = new Engine("POK300", "electric", 10.9);

        // Вивід у консоль даних
        volvo.dataAuto();
        engineVolvo.dataEngine();
    }

    // Дані SETRA і двигуна
    public void dataBusSetra() {

        // Створення SETRA і двигуна
        Bus setra = new Bus("SETRA", "Kassbohrer", 2017,21.400f,120);
        Engine engineSetra = new Engine("JJ890L", "gaz", 14.2);

        // Вивід у консоль даних
        setra.dataAuto();
        engineSetra.dataEngine();
    }

    // Дані IKARUS і двигуна
    public void dataBusIkarus() {

        // Створення IKARUS і двигуна
        Bus ikarus = new Bus("IKARUS", "Makador", 2019,22.000f,100);
        Engine engineIkarus = new Engine("NMN033", "diesel", 10.2);

        // Вивід у консоль даних
        ikarus.dataAuto();
        engineIkarus.dataEngine();
    }
    // Переписуєм метод з батьківського класу
    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Модель:" + model + " Рік:" + year +
                " Вага:" + weight + " Макс швидкість:" + maxSpeed);
    }
}