package com.lits.hw5;

public class Bus extends Engine implements Auto {
    private String name;
    private String type;
    private String model;
    private int year;
    private int maxspeed;

    // Конструктор Bus
    public Bus(String name, String type, String model, int year, int maxspeed) {
        this.name = name;
        this.type = type;
        this.model = model;
        this.year = year;
        this.maxspeed = maxspeed;
    }

    // Конструктор Bus
    public Bus() {
    }

    // Дані Neoplan
    public void dataBusNeoplan() {
        Bus neoplan = new Bus("NEOPLAN", "Bus", "Trendliner", 2020, 180);
        neoplan.setSerialNumber("390VXC55");
        neoplan.setTypeEngine("gaz-gazoline");
        neoplan.setPowerEngine(12.6);
        neoplan.dataAuto();
        System.out.println();
    }

    // Дані Volvo
    public void dataBusVolvo() {
        Bus volvo = new Bus("VOLVO", "Bus", "Volvo 9900", 2019, 160);
        volvo.setSerialNumber("654JVA812");
        volvo.setTypeEngine("electric");
        volvo.setPowerEngine(11.6);
        volvo.dataAuto();
        System.out.println();
    }

    // Дані Setra
    public void dataBusSetra() {
        Bus setra = new Bus("SETRA", "Bus", "Kassbohrer", 2018, 140);
        setra.setSerialNumber("654JVA812");
        setra.setTypeEngine("gaz");
        setra.setPowerEngine(14.2);
        setra.dataAuto();
        System.out.println();
    }

    // Дані Ikarus
    public void dataBusIkarus() {
        Bus ikarus = new Bus("IKARUS", "Bus", "Makador", 2019, 130);
        ikarus.setSerialNumber("654JVA812");
        ikarus.setTypeEngine("diesel");
        ikarus.setPowerEngine(10.2);
        ikarus.dataAuto();
        System.out.println();
    }

    // Імплементація з інтерфейсу Auto, дані авто Bus
    @Override
    public void dataAuto() {
        System.out.println("Назва:" + name + " Тип авто:" + type + " Модель:" + model + " Рік:" + year + " Макс швидкість:" + maxspeed);
        System.out.println("Серійний номер:" + getSerialNumber() + " Тип палива:" + getTypeEngine() + " Обʼєм двигуна:" + getPowerEngine());
    }

    // Імплементація інтерфейсу Auto
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