package com.lits.hw5;

public class Truck extends Auto {

<<<<<<< HEAD
    // Конструктор Truck
    public Truck(String name, String model, int year, float weight, int maxspeed) {
        super(name, model, year, weight, maxspeed);
=======
    private float weight;
    private int maxSpeed;
    // Двигун Truck
    private Engine engine;

    // Конструктор Truck
    public Truck(String name, String model, int year, float weight, int maxSpeed) {
        super(name, model, year);
        this.weight = weight;
        this.maxSpeed = maxSpeed;
>>>>>>> origin
    }

    // Конструктор Truck
    public Truck() {
    }

    // Дані MAN і двигуна
    public void dataTruckMan() {

        // Створення MAN і двигуна
        Truck man = new Truck("MAN", "Welly", 2017, 28.500f, 120);
<<<<<<< HEAD

        // Вивід у консоль даних
        man.dataAuto();
=======
        Engine engineMan = new Engine("KJJ988", "diesel", 14.6);

        // Вивід у консоль даних
        man.dataAuto();
        engineMan.dataEngine();
>>>>>>> origin
    }

    // Дані SCANIA і двигуна
    public void dataTruckScania() {

<<<<<<< HEAD
        // Створення SCANIA і двигуна
        Truck scania = new Truck("SCANIA", "Century", 2019, 26000, 110);

        // Вивід у консоль даних
        scania.dataAuto();
=======
        // Створення MAN і двигуна
        Truck scania = new Truck("SCANIA", "Century", 2019, 26000, 110);
        Engine engineScania = new Engine("MNN600", "diesel", 15.6);

        // Вивід у консоль даних
        scania.dataAuto();
        engineScania.dataEngine();
>>>>>>> origin
    }

    // Дані RENAULT і двигуна
    public void dataTruckRenault() {

<<<<<<< HEAD
        // Створення RENAULT і двигуна
        Truck renault = new Truck("RENAULT", "Marius", 2018, 29000, 130);

        // Вивід у консоль даних
        renault.dataAuto();
=======
        // Створення MAN і двигуна
        Truck renault = new Truck("RENAULT", "Marius", 2018, 29000, 130);
        Engine engineRenault = new Engine("LL700M", "diesel", 15.3);

        // Вивід у консоль даних
        renault.dataAuto();
        engineRenault.dataEngine();
>>>>>>> origin
    }

    // Дані DAF і двигуна
    public void dataTruckDaf() {

<<<<<<< HEAD
        // Створення DAF і двигуна
        Truck daf = new Truck("DAF", "XF900", 2018, 25.400f, 100);

        // Вивід у консоль даних
        daf.dataAuto();
=======
        // Створення MAN і двигуна
        Truck daf = new Truck("DAF", "XF900", 2018, 25.400f, 100);
        Engine engineDaf = new Engine("KJH8LL", "diesel", 12.3);

        // Вивід у консоль даних
        daf.dataAuto();
        engineDaf.dataEngine();
    }
    // Переписуєм метод з батьківського класу
    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Модель:" + model + " Рік:" + year +
                " Вага:" + weight + " Макс швидкість:" + maxSpeed);
>>>>>>> origin
    }
}