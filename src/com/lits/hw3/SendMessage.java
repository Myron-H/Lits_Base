package com.lits.hw3;

public class SendMessage extends People implements SendCenter {
    // Перезаписуєм метод, поліморфизм
    @Override
    public void sendToCenter(int distanceMks) {
        // Приймаємо дані від пілота
        System.out.println("Палива вистачить на " + distanceMks + " км");
        // якщо відстань більше або рівна відстані до МКС то палива вистачить
        if (distanceMks >= SpaceX.distance) {

            System.out.println("... Космічний корабель " + SpaceX.name + " компанії " +
                    getNameCompany() + " з запасом палива успішно летить до МКС");
            // якщо не вистачить палива то надсилаємо SOS
        } else {
            System.out.println("SOS SOS SOS, Палива вистачить на " + distanceMks + " км");
        }
    }
}
