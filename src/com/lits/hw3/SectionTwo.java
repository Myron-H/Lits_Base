package com.lits.hw3;

public class SectionTwo extends SpaceX {
    static void sepSectionTwo() {
        //  Секція 2 згорає
        com.lits.hw3.SectionTwo.weightSection = 0;

        //  Змінюється вага SpaceX, остаток палива і відстань до МКС
        SpaceX.weight = 5000;
        fuel = 300;
        distance = 200;
    }
}
