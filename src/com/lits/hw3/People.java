package com.lits.hw3;

public class People extends SpaceX {
    public String namePeople, profPeople;
    public int agePeople;

    // Створюємо екіпаж і передаєм дані у метод sayPeople
    public static void crewPeople() {
        com.lits.hw3.People oleg = new com.lits.hw3.People();
        oleg.sayPeople("Олег", 35, "астонавт");
        com.lits.hw3.People igor = new com.lits.hw3.People();
        igor.sayPeople("Ігор", 42, "космолог");

    }

    //  Приймаємо дані з екіпажу і виводим у консоль
    public void sayPeople(String namePeople, int agePeople, String profPeople) {

        System.out.println(namePeople + " " + agePeople + " років " + profPeople);
    }
}
