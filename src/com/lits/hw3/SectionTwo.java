package com.lits.hw3;

public class SectionTwo extends SpaceX {    // Наслідник SpaceX

    public SectionTwo() {
        //  Змінюється вага SpaceX, остаток палива і відстань до МКС, Секція 2 згорає
        super.weight = 6000;
        super.fuel = 300;
        super.distance = 200;
    }

    public void SecTwoChange() {
        System.out.println("Вага ракети " + weight + ", палива " + fuel + ", дистанція до МКС " + distance);
    }
}
