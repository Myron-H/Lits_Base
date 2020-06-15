package com.lits.hw3;

public class SenderMail extends People {
    // Перезаписуєм метод, поліморфизм
    @Override
    public void sendToCenter() {
        System.out.println("... Космічний корабель " + SpaceX.name + " компанії " +
                getNameCompany() + " успішно зістикувався з МКС");
    }
}
