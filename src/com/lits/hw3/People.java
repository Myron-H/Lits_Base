package com.lits.hw3;

public class People extends SpaceX implements SendCenter{
    private String namePeople;
    private String profPeople;
    private int agePeople;

    // Конструктор екіпажу
    public People(String namePeople, int agePeople, String profPeople) {
        this.namePeople = namePeople;
        this.agePeople = agePeople;
        this.profPeople = profPeople;
    }

    // Дані екіпажу
    public void dataPeople() {
        System.out.println("Екіпаж: ");
        People max = new People("Max", 53, "командир");
        max.sayPeople("Max", 53, "командир");
        People jone = new People("Jone", 49, "пілот");
        jone.sayPeople("Jone", 49, "пілот");
    }

    public People() {
    }

    //  Приймаємо дані з екіпажу і виводим у консоль
    public void sayPeople(String namePeople, int agePeople, String profPeople) {
        System.out.println(namePeople + " " + agePeople + " років " + profPeople);

    }

    // Приймаємо дані від командира
    @Override
    public void sendToCenter (int distanceMks) {
        SpaceX.distanceMks = distanceMks;
        People jone = new SendMessage();
        // Відсилаємо дані у Центр
        jone.sendToCenter(distanceMks);
    }
}
