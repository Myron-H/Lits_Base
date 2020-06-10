package com.lits.hw3;

public class People {
    public String namePeople, profPeople;
    public int agePeople;

    // Конструктор екіпажу
    public People(String namePeople, int agePeople, String profPeople) {
        this.namePeople = namePeople;
        this.agePeople = agePeople;
        this.profPeople = profPeople;
    }

    //  Приймаємо дані з екіпажу і виводим у консоль
    public void sayPeople(String namePeople, int agePeople, String profPeople) {
        System.out.println(namePeople + " " + agePeople + " років " + profPeople);
    }
}
