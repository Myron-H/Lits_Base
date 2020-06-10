package com.lits.hw3;

public class SectionThree extends SpaceX {   // Наслідник SpaceX

    public SectionThree() {
        //  Змінюється вага SpaceX, остаток палива і відстань до МКС, Секція 3 згорає
        super.weight = 5000;
        super.fuel = 250;
        super.distance = 150;
    }

    public void SecThreeChange() {
        System.out.println("Вага ракети " + weight + ", палива " + fuel + ", дистанція до МКС " + distance);
    }
}
