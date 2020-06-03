package com.lits.second;

public class Zoo {
    public static final String nameZoo = "<<Джунглі>>";
    public final String open = "8:00";
    public final String close = "20:00";
    final People oleg = new People("Олег", 25, "робочий");
    final People max = new People("Макс", 32, "прибиральник");
    final Animals cat = new Animals("Мурка", 8, "кішка");
    final Animals dog = new Animals("Рекс", 12, "собака");

    public void zo() {
        System.out.println("Зоопарк " + nameZoo + " Графік роботи " + open + " - " + close);
    }
}
