package com.lits.hw3;

public class SpaceCenter {
    private final static String nameCenter = "Houston";
    private final static String nameCompany = "*SpaceX*";
    public String mission = "Політ на МКС";

    public void start() {

        // Таймер зворотнього відліку
        int[] timer = {1, 2, 3, 4, 5};
        for (int i = timer.length; i >= 0; i--) {
            System.out.println("Відлік часу: " + i);
            if (i == 0) {
                // Статус ракети
                Status statusStart = Status.START;
                System.out.println("Статус ракети: " + statusStart);
            }
        }
    }

    // Геттери
    public String getNameCenter() {
        return nameCenter;
    }

    public String getNameCompany() {
        return nameCompany;
    }
}
