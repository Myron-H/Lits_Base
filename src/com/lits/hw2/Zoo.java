package com.lits.hw2;

public class Zoo {
    public int id = 1;
    public static String nameZoo = "<<Джунглі>>";
    public float open = 9.00f, close = 18.00f;
    final People oleg = new People(2, "Олег", 25, "робочий");
    final People max = new People(3, "Макс", 32, "прибиральник");
    final Animals cat = new Animals(4, "Мурка", 8, "кішка");
    final Animals dog = new Animals(5, "Рекс", 12, "собака");

    public void zo() {
        System.out.println(id + " Зоопарк " + nameZoo + " Графік роботи " + open + " - " + close);
    }
}
