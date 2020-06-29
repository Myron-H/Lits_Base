package hw7;

public class Car extends CustomComparator {
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

    // Гетери і сетери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public float getCapacityEngine() {
        return capacityEngine;
    }

    public void setCapacityEngine(float capacityEngine) {
        this.capacityEngine = capacityEngine;
    }

    // Перезапис методу для строкового виводу у консоль
    @Override
    public String toString() {
        return "\n" + "Car name=" + name + ", model=" + model +
                ", releaseYear=" + releaseYear + ", typeEngine=" + typeEngine +
                ", capacityEngine=" + capacityEngine;
    }
}
