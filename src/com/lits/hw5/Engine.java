package com.lits.hw5;

public class Engine extends Auto {

    private int idEngine;
    private String typeEngine;
    private double powerEngine;

    // Конструктор Engine
    public Engine(int idEngine, String typeEngine, double powerEngine) {
        this.idEngine = idEngine;
        this.typeEngine = typeEngine;
        this.powerEngine = powerEngine;
    }

    // Конструктор Engine
    public Engine() {
    }

    public int getIdEngine() {
        return idEngine;
    }
}