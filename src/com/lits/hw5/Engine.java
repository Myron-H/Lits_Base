package com.lits.hw5;

public class Engine {
    private String serialNumber;
    private String typeEngine;
    private double powerEngine;

    // Гетери і Сетери
    public void setPowerEngine(double powerEngine) {
        this.powerEngine = powerEngine;
    }

    public double getPowerEngine() {
        return powerEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
