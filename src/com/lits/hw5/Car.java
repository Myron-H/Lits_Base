package com.lits.hw5;

public class Car extends Auto {

    // Конструктор Car
    public Car(String name, String model, int year, float weight, int maxspeed,
               int idEngine, String typeEngine, double powerEngine) {
        super(name, model, year, weight, maxspeed, idEngine, typeEngine, powerEngine);
    }

    // Конструктор Car
    public Car() {
    }

    // Дані MERCEDES і двигуна
    public void dataCarMers() {

        // Створення MERCEDES і двигуна
        Car mercedes = new Car("MERCEDES", "A-Class", 2019, 2.250f, 320,
                256003, "gaz", 3.6);

        // Вивід у консоль даних
        mercedes.dataAuto();
    }

    // Дані BMW і двигуна
    public void dataCarBmw() {

        // Створення BMW і двигуна
        Car bmw = new Car("BMW", "X5", 2020, 2.560f, 360,
                568200, "diesel", 3.2);

        // Вивід у консоль даних
        bmw.dataAuto();
    }

    // Дані AUDI і двигуна
    public void dataCarAudi() {

        // Створення AUDI і двигуна
        Car audi = new Car("AUDI", "A8", 2017, 2.600f, 340,
                568123, "gazoline", 4.2);

        // Вивід у консоль даних
        audi.dataAuto();
    }

    // Дані TOYOTA і двигуна
    public void dataCarToyota() {

        // Створення TOYOTA і двигуна
        Car toyota = new Car("TOYOTA", "Corolla", 2017, 2.400f, 280,
                458555, "electric", 2.6);

        // Вивід у консоль даних
        toyota.dataAuto();
    }
}