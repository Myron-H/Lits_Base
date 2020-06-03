package com.lits.second;

public class People {
    public final String namePeople;
    public final int agePeople;
    public final String professionPeople;

    public People(String namePeople, int agePeople, String professionPeople) {
        this.namePeople = namePeople;
        this.agePeople = agePeople;
        this.professionPeople = professionPeople;
    }

    public void say() {
        System.out.println("Мене звати " + namePeople + " мені " + agePeople + " років і я працюю в зоопарку " + professionPeople);
    }
}
