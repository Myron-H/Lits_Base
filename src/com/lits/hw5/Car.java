package com.lits.hw5;

public class Car extends Auto implements Automobile {

    // Конструктор Car
    public Car(String name, String model, int year) {
        super(name, model, year);
    }

    // Конструктор Car
    public Car() {
    }

    // Дані MERCEDES і двигуна
    public void dataCarMers() {

        // Створення MERCEDES і двигуна
        Car mercedes = new Car("MERCEDES", "A-Class", 2019);
        Engine engineMers = new Engine("NNN80J", "electric", 4.6);

        // Вивід у консоль даних
        mercedes.dataAuto();
        engineMers.dataEngine();
    }

    // Дані BMW і двигуна
    public void dataCarBmw() {

        // Створення BMW і двигуна
        Car bmw = new Car("BMW", "X5", 2020);
        Engine engineBmw = new Engine("XX7JH8", "gaz-gazoline", 4.8);

        // Вивід у консоль даних
        bmw.dataAuto();
        engineBmw.dataEngine();
    }

    // Дані AUDI і двигуна
    public void dataCarAudi() {

        // Створення AUDI і двигуна
        Car audi = new Car("AUDI", "A8", 2017);
        Engine engineAudi = new Engine("564HJG", "gazoline", 3.6);

        // Вивід у консоль даних
        audi.dataAuto();
        engineAudi.dataEngine();
    }

    // Дані TOYOTA і двигуна
    public void dataCarToyota() {

        // Створення TOYOTA і двигуна
        Car toyota = new Car("TOYOTA", "Corolla", 2017);
        Engine engineToyota = new Engine("JHG980", "gaz", 2.6);

        // Вивід у консоль даних
        toyota.dataAuto();
        engineToyota.dataEngine();
    }
}