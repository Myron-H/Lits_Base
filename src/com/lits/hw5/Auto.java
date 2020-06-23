package com.lits.hw5;

public class Auto {

    public String name;
    public String model;
    public int year;
    public float weight;
    public int maxSpeed;
    public Engine engine;

    // Конструктор Auto
    public Auto(String name, String model, int year, float weight, int maxSpeed,
                int idEngine, String typeEngine, double powerEngine) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.engine = new Engine(idEngine, typeEngine, powerEngine);

    }

    // Конструктор Auto
    public Auto() {
    }

    // Перепис метода у наслідниках
    public void dataAuto() {
    }
}