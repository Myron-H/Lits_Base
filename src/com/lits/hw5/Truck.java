package com.lits.hw5;

public class Truck extends Engine implements Auto {
    private String name;
    private String type;
    private String model;
    private int year;
    private int maxspeed;

    // Конструктор Truck
    public Truck(String name, String type, String model, int year, int maxspeed) {
        this.name = name;
        this.type = type;
        this.model = model;
        this.year = year;
        this.maxspeed = maxspeed;
    }

    // Конструктор Truck
    public Truck() {
    }

    // Дані Man
    public void dataTruckMan() {
        Truck man = new Truck("MAN", "Truck", "Welly", 2018, 160);
        man.setSerialNumber("7364HDS89");
        man.setTypeEngine("diesel");
        man.setPowerEngine(14.6);
        man.dataAuto();
        System.out.println();
    }

    // Дані Scania
    public void dataTruckScania() {
        Truck scania = new Truck("SCANIA", "Truck", "Century", 2019, 140);
        scania.setSerialNumber("GFD673CVV");
        scania.setTypeEngine("diesel");
        scania.setPowerEngine(15.6);
        scania.dataAuto();
        System.out.println();
    }

    // Дані Renault
    public void dataTruckRenault() {
        Truck renault = new Truck("RENAULT", "Truck", "Marius", 2018, 130);
        renault.setSerialNumber("854HFT355");
        renault.setTypeEngine("diesel");
        renault.setPowerEngine(15.3);
        renault.dataAuto();
        System.out.println();
    }

    // Дані DAF
    public void dataTruckDaf() {
        Truck daf = new Truck("DAF", "Truck", "XF900", 2019, 120);
        daf.setSerialNumber("876FGV54D");
        daf.setTypeEngine("diesel");
        daf.setPowerEngine(12.3);
        daf.dataAuto();
        System.out.println();
    }

    // Імплементація з інтерфейсу Auto, дані авто Truck
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