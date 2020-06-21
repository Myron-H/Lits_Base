package com.lits.hw5;

public class Car extends Engine implements Auto {
    private String name;
    private String type;
    private String model;
    private int year;
    private int maxspeed;

    // Конструктор Car
    public Car(String name, String type, String model, int year, int maxspeed) {
        this.name = name;
        this.type = type;
        this.model = model;
        this.year = year;
        this.maxspeed = maxspeed;
    }

    // Конструктор Car
    public Car() {
    }

    // Дані Mers
    public void dataCarMers() {
        Car mercedes = new Car("MERCEDES", "Car", "A-Class", 2020, 380);
        mercedes.setSerialNumber("ZZJG9000");
        mercedes.setTypeEngine("gaz-gazoline");
        mercedes.setPowerEngine(4.6);
        mercedes.dataAuto();
        System.out.println();
    }

    // Дані BMW
    public void dataCarBmw() {
        Car bmw = new Car("BMW", "Car", "X5", 2020, 420);
        bmw.setSerialNumber("XX7000HF");
        bmw.setTypeEngine("gaz-gazoline");
        bmw.setPowerEngine(4.8);
        bmw.dataAuto();
        System.out.println();
    }

    // Дані Audi
    public void dataCarAudi() {
        Car audi = new Car("AUDI", "Car", "A8", 2017, 340);
        audi.setSerialNumber("564HJGF90");
        audi.setTypeEngine("gazoline");
        audi.setPowerEngine(3.6);
        audi.dataAuto();
        System.out.println();
    }

    // Дані Toyota
    public void dataCarToyota() {
        Car toyota = new Car("TOYOTA", "Car", "Corolla", 2017, 280);
        toyota.setSerialNumber("KUT908LO0");
        toyota.setTypeEngine("gazoline");
        toyota.setPowerEngine(1.6);
        toyota.dataAuto();
        System.out.println();
    }

    // Імплементація з інтерфейсу Auto, дані авто Car
    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Тип авто:" + type + " Модель:" + model + " Рік:" + year + " Макс швидкість:" + maxspeed);
        System.out.println("Серійний номер:" + getSerialNumber() + " Тип палива:" + getTypeEngine() + " Обʼєм двигуна:" + getPowerEngine());
    }

    // Імплементація з інтерфейсу Auto
    @Override
    public void type(String type) {
        this.type = type;
    }

    @Override
    public void model(String model) {
        this.model = model;
    }

    @Override
    public void year(int year) {
        this.year = year;
    }
}