package com.lits.hw3;

public class SpaceX {
    // Параметри Crew Dragon і секцій
    public final static String nameCompany = "*SpaceX*";
    public static String name = "<Crew Dragon>", mission = "Політ на МКС";
    public static int height = 25, // висота ракети
            weight = 8000,         // вага ракети
            weightSection = 1000,  // вага одної секції
            fuel = 400,            // кількість палива
            distance = 300,        // відстань до МКС
            MaxSpeed = 500,        // максимальна швидкість
            consumption = 1;       // розхід палива на 1 км

    //  Відокремлення секцій
    static void sepSection(int nameSection) {
        System.out.println(nameSection + " секція відділяється");
    }

    // Летимо у космос
    static void goSpace() {

        // Розганяємось
        for (int i = 0; i <= MaxSpeed; i += 100) {
            System.out.println("Швидкість " + i);
            switch (i) {
                case 400:
                    // 400 км/год Секція 1 відділяється
                    com.lits.hw3.SpaceX.sepSection(1);

                    // Згорання Секції 1 і втрата маси SpaceX
                    SectionOne.sepSectionOne();

                    // Зменшення палива і дистанції до МКС
                    System.out.println("Палива " + fuel + " дистанція до МКС " + distance);
                    break;

                case 500:
                    // 500 км/год Секція 2 відділяється
                    com.lits.hw3.SpaceX.sepSection(2);

                    // Згорання Секції 2 і втрата маси SpaceX
                    SectionTwo.sepSectionTwo();

                    // Зменшення палива і дистанції до МКС
                    System.out.println("Палива " + fuel + " дистанція до МКС " + distance);

                    // Ми в космосі :)
                    System.out.println("Ми в космосі!!!");
                    break;
            }
        }
    }

    // Розхід палива на км
    static void mileage() {
        // взнаємо на скільки км вистачить палива
        int distanceMks;
        distanceMks = fuel / consumption;

        // якщо відстань більше або рівна до мкс то палива вистачить і летимо до МКС, якщо ні то SOS
        if (distanceMks >= distance) {
            System.out.println("Палива вистачить на " + distanceMks + " км");
            Main.goMKS();
        } else {
            System.out.println("SOS SOS SOS!!! Палива вистачить тільки на " + distanceMks + " км");
        }
    }

}
