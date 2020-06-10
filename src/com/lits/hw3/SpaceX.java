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
        System.out.println(nameSection + " секція відділяється");
    }

    // Летимо у космос
    public void goSpace() {

        // Розганяємось
        for (int i = 0; i <= MaxSpeed; i += 100) {
            System.out.println("Швидкість " + i);
            switch (i) {
                case 400:
                    // 400 км/год, Секція 1 відділяєтьс, згорання Секції 1 і втрата маси SpaceX
                    SectionOne sectionone = new SectionOne();
                    sectionone.sepSection(1);
                    // Зменшення палива і дистанції до МКС
                    sectionone.SecOneChange();
                    break;
                case 500:
                    // 500 км/год, Секція 2 відділяється, згорання Секції 2 і втрата маси SpaceX
                    SectionTwo sectiontwo = new SectionTwo();
                    sectiontwo.sepSection(2);
                    // Зменшення палива і дистанції до МКС
                    sectiontwo.SecTwoChange();
                    break;
                case 600:
                    // 600 км/год, Секція 3 відділяється, згорання Секції 3 і втрата маси SpaceX
                    SectionThree sectionthree = new SectionThree();
                    sectionthree.sepSection(3);
                    // Зменшення палива і дистанції до МКС
                    sectionthree.SecThreeChange();

                    // Ми в космосі :)
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

        // якщо відстань більше або рівна до мкс то палива вистачить і летимо до МКС, якщо ні то SOS
        if (distanceMks >= distance) {
            System.out.println("Палива вистачить на " + distanceMks + " км");
            Main main = new Main();
            main.goMKS();
        } else {
            System.out.println("SOS SOS SOS!!! Палива вистачить тільки на " + distanceMks + " км");
        }
    }
}