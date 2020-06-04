package com.lits.second;

public class People {
    public int id;
    public String namePeople;
    public int agePeople;
    public String professionPeople;

    public People(int idPeople, String namePeople, int agePeople, String professionPeople) {
        this.id = idPeople;
        this.namePeople = namePeople;
        this.agePeople = agePeople;
        this.professionPeople = professionPeople;
    }

    public void say() {
        System.out.println(id + " " + namePeople + " " + agePeople + " років " + professionPeople);
    }
}
