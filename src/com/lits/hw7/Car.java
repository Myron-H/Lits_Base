package com.lits.hw7;

public class Car {
    private String name;
    private String model;
    private int releaseYear;
    private String typeEngine;
    private float capacityEngine;

    // Конструктор Car
    public Car(String name, String model, int releaseYear, String typeEngine, float capacityEngine) {
        this.name = name;
        this.model = model;
        this.releaseYear = releaseYear;
        this.typeEngine = typeEngine;
        this.capacityEngine = capacityEngine;
    }

    // Гетери
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public float getCapacityEngine() {
        return capacityEngine;
    }

    // Перезапис методу для строкового виводу у консоль
    @Override
    public String toString() {
        return "\n" + "Car name=" + name + ", model=" + model +
                ", releaseYear=" + releaseYear + ", typeEngine=" + typeEngine +
                ", capacityEngine=" + capacityEngine;
    }
}
