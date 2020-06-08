package com.lits.hw3;

public class SectionOne extends SpaceX {
    static void sepSectionOne() {
        //  Секція 1 згорає
        com.lits.hw3.SectionOne.weightSection = 0;

        //  Змінюється вага SpaceX, остаток палива і відстань до МКС
        SpaceX.weight = 6000;
        fuel = 350;
        distance = 250;
    }
}

