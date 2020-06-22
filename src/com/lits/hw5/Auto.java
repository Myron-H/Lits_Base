package com.lits.hw5;

public class Auto implements Automobile {

    private String name;
    private String model;
    private int year;

    // Конструктор Auto
    public Auto(String name, String model, int year) {

        this.name = name;
        this.model = model;
        this.year = year;
    }

    // Конструктор Auto
    public Auto() {
    }

    // Імплемент методів інтерфейсу Automobile
    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void model(String model) {
        this.model = model;
    }

    @Override
    public void year(int year) {
        this.year = year;
    }

    // Вивід у консоль даних авто
    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Модель:" + model + " Рік:" + year);
    }
}