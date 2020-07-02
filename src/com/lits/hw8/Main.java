package com.lits.hw8;

public class Main {

    public static void main(String[] args) {

        // Кастомний HasMap
        MyHashMap<String,String> myHashMap = new MyHashMap<String, String>();
        myHashMap.put("01","One");
        myHashMap.put("02","Two");
        myHashMap.put("03","Three");
        myHashMap.put("04","Four");
        myHashMap.put("05","Five");

        // розмір колекції
        System.out.println(myHashMap.size());
        // вивести дані під ключом 02
        System.out.println(myHashMap.get("02"));
        // видалення ключа 04
        myHashMap.delete("04");
        // розмір колекції
        System.out.println(myHashMap.size());
        // хеш колекціїї
        System.out.println(myHashMap.hashCode());
        // перевірка чи є ключ 03
        System.out.println(myHashMap.containsKey("03"));
        // перевірка чи порожня колекція
        System.out.println(myHashMap.isEmpty());
    }
}
