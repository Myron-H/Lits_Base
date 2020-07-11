package com.lits.hw9;

public class SpaceCenter {

    private final static String nameCenter = "Houston";
    private final static String nameCompany = "*SpaceX*";
    public String mission = "Політ на МКС";


    // може викинути Exception
    public void start() throws MyException {

        // Таймер зворотнього відліку
        int[] timer = {1, 2, 3, 4, 5};
        for (int i = timer.length; i >= 0; i--) {
            System.out.println("Відлік часу: " + i);
            if (i == 0) {
                // Статус ракети
                System.out.println("Статус ракети: " + Status.START);
            } else if (i < 0){
                throw new MyException("Вихід за межі масиву");
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