package com.lits.hw3;

public class SenderSMS extends People {
    // Перезаписуєм метод, поліморфизм
    @Override
    public void sendToCenter() {
        System.out.println("SOS SOS SOS, палива тільки вистачить на" + SpaceX.distanceMks + " км");
    }
}
