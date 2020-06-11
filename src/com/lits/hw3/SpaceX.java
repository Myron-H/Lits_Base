package com.lits.hw3;

public class SpaceX {
    // Параметри Crew Dragon і секцій
    public final static String nameCompany = "*SpaceX*";
    public static String name = "<Crew Dragon>", mission = "Політ на МКС";
    public int height = 25,     // висота ракети
            weight = 8000,         // вага ракети
            weightSection = 1000,  // вага одної секції
            fuel = 400,            // паливо
            distance = 300,        // відстань до МКС
            MaxSpeed = 600,        // максимальна швидкість
            consumption = 1;       // розхід палива на 1 км

    //  Відокремлення секцій
    public void sepSection(int nameSection) {
    }

    // Летимо у космос
    public void goSpace() {

        // Розганяємось
        for (int i = 0; i <= MaxSpeed; i += 100) {
            System.out.println("Швидкість " + i);
            if (i == 400) {
                // зменшення маси ракети відділенням секції 1
                weight -= weightSection;

                // зменшення дистанції і палива до МКС
                distance -= 50;
                fuel = distance / consumption + 100; // +100 - запас палива

            } else if (i == 500) {
                // зменшення маси ракети відділенням секції 2
                weight -= weightSection;

                // зменшення дистанції і палива до МКС
                distance -= 50;
                fuel = distance / consumption + 100;

            } else if (i == 600) {
                // зменшення маси ракети відділенням секції 3
                weight -= weightSection;

                // зменшення дистанції і палива до МКС
                distance -= 50;
                fuel = distance / consumption + 100;
            }

            switch (i) {
                case 400:
                    // 400 км/год, Секція 1 відділяється
                    SpaceX sectionOne = new SectionOne();  // Поліморфизм
                    sectionOne.sepSection(1);
                    // Виводим змінені параметри у консоль
                    System.out.println("Вага ракети " + weight + ", палива " + fuel + ", дистанція до МКС " + distance);
                    break;
                case 500:
                    // 500 км/год, Секція 2 відділяється
                    SpaceX sectionTwo = new SectionTwo();  // Поліморфизм
                    sectionTwo.sepSection(2);
                    // Виводим змінені параметри у консоль
                    System.out.println("Вага ракети " + weight + ", палива " + fuel + ", дистанція до МКС " + distance);
                    break;
                case 600:
                    // 600 км/год, Секція 3 відділяється
                    SpaceX sectionThree = new SectionThree();  // Поліморфизм
                    sectionThree.sepSection(3);
                    // Виводим змінені параметри у консоль
                    System.out.println("Вага ракети " + weight + ", палива " + fuel + ", дистанція до МКС " + distance);

                    // Ми в космосі :)
                    System.out.println("");
                    System.out.println("Ми в космосі!!!");
                    break;
            }
        }
    }

    // Розхід палива на км
    public void mileage() {
        // взнаємо на скільки км вистачить палива
        int distanceMks;
        distanceMks = fuel / consumption;

        // якщо відстань більше або рівна до МКС то палива вистачить і летимо до МКС, якщо ні то SOS
        if (distanceMks >= distance) {
            System.out.println("Палива вистачить на " + distanceMks + " км");
            System.out.println("... Космічний корабель " + name + " компанії " +
                    nameCompany + " успішно зістикувався з МКС");
        } else {
            System.out.println("SOS SOS SOS!!! Палива вистачить тільки на " + distanceMks + " км");
        }
    }
}