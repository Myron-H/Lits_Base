package com.lits.hw5;

//Дженеріки лише з класу Auto і його наслідників
public class Garage<T extends Auto> {
    private String name;
    private T auto;
    private T auto2;
    private T auto3;

    // Назва гаража
    public void nameGarage(String name) {
        System.out.println(name);
    }

    // Конструктор гаража
    public Garage(T auto, T auto2, T auto3) {
        this.auto = auto;
        this.auto2 = auto2;
        this.auto3 = auto3;
    }
}