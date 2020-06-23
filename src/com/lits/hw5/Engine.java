package com.lits.hw5;

public class Engine {

    private int idEngine;
    private String typeEngine;
    private double powerEngine;

    // Конструктор Engine
    public Engine(int idEngine, String typeEngine, double powerEngine) {
        this.idEngine = idEngine;
        this.typeEngine = typeEngine;
        this.powerEngine = powerEngine;
    }

    // Геттери
    public int getIdEngine() {
        return idEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public double getPowerEngine() {
        return powerEngine;
    }

}