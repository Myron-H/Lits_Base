package com.lits.hw5;

public class Car extends Auto {

    public Engine engine;

    // Конструктор Car
    public Car(String name, String model, int year, float weight, int maxspeed,
               int idEngine, String typeEngine, double powerEngine) {
        super(name, model, year, weight, maxspeed);
        this.engine = new Engine(idEngine, typeEngine, powerEngine);
    }

    // Переоприділений метод з супер класу
    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Модель:" + model + " Рік:" + year +
                " Вага:" + weight + " Макс швидкість:" + maxSpeed + " VIN:" + engine.getIdEngine() +
                " Тип двигуна:" + engine.getTypeEngine() + " Обʼєм двигуна:" + engine.getPowerEngine());
    }
}