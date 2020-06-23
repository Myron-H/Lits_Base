package com.lits.hw5;

public class Auto {

    public String name;
    public String model;
    public int year;
    public float weight;
    public int maxSpeed;

    // Конструктор Auto
    public Auto(String name, String model, int year, float weight, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    // Переоприділення метода у наслідниках
    public void dataAuto() {
    }
}