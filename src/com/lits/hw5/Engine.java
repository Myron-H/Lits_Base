package com.lits.hw5;

public class Engine extends Auto {

    private String serialNumber;
    private String typeEngine;
    private double powerEngine;

    // Конструктор Engine
    public Engine(String serialNumber, String typeEngine, double powerEngine) {
        this.serialNumber = serialNumber;
        this.typeEngine = typeEngine;
        this.powerEngine = powerEngine;
    }

    // Конструктор Engine
    public Engine() {
    }

    // Вивід у консоль даних двигуна
    public void dataEngine() {
        System.out.println("S/N:" + serialNumber + " Тип палива:" + typeEngine + " Обʼєм двигуна:" + powerEngine);
        System.out.println();
    }
    // Сеттери
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public void setPowerEngine(double powerEngine) {
        this.powerEngine = powerEngine;
    }
}