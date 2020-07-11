package com.lits.hw9;

public class SectionTwo extends SpaceX {
    // Відділення секції, перезаписуєм метод, поліморфизм
    @Override
    public void sepSection(int nameSection) {
        super.weightSection = 0;
        System.out.println(nameSection + " секція відділяється");
    }
}
