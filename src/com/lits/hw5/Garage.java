package com.lits.hw5;

//Дженеріки лише з класу Auto і його наслідників
public class Garage<T extends Auto> {
    public String name;
    public T Car;
    public T Truck;
    public T Bus;

    // Конструктор гаража
    public Garage(T Car, T Truck, T Bus) {
        this.Car = Car;
        this.Truck = Truck;
        this.Bus = Bus;
    }
}