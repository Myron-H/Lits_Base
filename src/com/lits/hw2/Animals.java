package com.lits.hw2;

public class Animals {
    public int id;
    public String nameAnimal;
    public int ageAnimal;
    public String specieAnimal;

    public Animals(int idAnimals, String nameAnimal, int ageAnimal, String specieAnimal) {
        this.id = idAnimals;
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.specieAnimal = specieAnimal;
    }

    public void sayAnimal(String nameAnimal, int ageAnimal, String specieAnimal) {
        System.out.println(id + " " + nameAnimal + " породи " + specieAnimal + " " + ageAnimal + " років");
    }
}
