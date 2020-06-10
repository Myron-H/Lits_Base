package com.lits.hw3;

public class SectionOne extends SpaceX {    // Наслідник SpaceX

    public SectionOne() {
        //  Змінюється вага SpaceX, остаток палива і відстань до МКС, Секція 1 згорає
        int weightOutOne;
        weightOutOne = weight - weightSection;
        super.weight = weightOutOne;
        super.fuel = 350;
        super.distance = 250;
    }

    public void SecOneChange() {
        System.out.println("Вага ракети " + weight + ", палива " + fuel + ", дистанція до МКС " + distance);
    }
}

