package com.lits.second;

public class Animals {
    public final String nameAnimal;
    public final int ageAnimal;
    public final String specieAnimal;

    public Animals(String nameAnimal, int ageAnimal, String specieAnimal) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.specieAnimal = specieAnimal;
    }

    public void sayAnimal(String nameAnimal, int ageAnimal, String specieAnimal) {
        System.out.println("Я " + nameAnimal + " породи " + specieAnimal + " мені " + ageAnimal + " років");
    }
}
