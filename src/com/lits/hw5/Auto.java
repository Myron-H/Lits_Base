package com.lits.hw5;

public class Auto {

    public String name;
    public String model;
    public int year;
    public float weight;
    public int maxSpeed;
    // Двигун
    private Engine engine;

    // Конструктор Auto
    public Auto(String name, String model, int year, float weight, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    // Конструктор Auto
    public Auto() {
    }

    // Вивід у консоль даних авто
    public void dataAuto() {
        System.out.println("Назва:" + name + " Модель:" + model + " Рік:" + year +
                " Вага:" + weight + " Макс швидкість:" + maxSpeed);
    }
}