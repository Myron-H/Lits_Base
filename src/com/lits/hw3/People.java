package com.lits.hw3;

public class People extends SpaceX {
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

    public void sendToCenter() {
    }

    //  Приймаємо дані з екіпажу і виводим у консоль
    public void sayPeople(String namePeople, int agePeople, String profPeople) {
        System.out.println(namePeople + " " + agePeople + " років " + profPeople);

    }

    // Приймаємо остаток палива і підраховуємо чи вистачить до МКС
    public void sendDistance(int distanceMks) {
        System.out.println("Палива вистачить на " + distanceMks + " км");
        sendMsg();
    }

    public void sendMsg() {
        // якщо відстань більше або рівна відстані до МКС то палива вистачить і надсилаємо Mail
        People jone;
        if (distanceMks >= distance) {

            jone = new SenderMail();
            // якщо не вистачить палива то надсилаємо SMS
        } else {
            jone = new SenderSMS();
        }
        // Відсилаємо повідомлення у Центр
        jone.sendToCenter();
    }
}
