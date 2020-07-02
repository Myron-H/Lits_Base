package com.lits.hw7;

import java.util.Comparator;

// Кастомний компаратор
// сортування по роках
public class CustomComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getReleaseYear() - o2.getReleaseYear();

    }

    // сортування по імені
    public static class NameComparator implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    // сортування по моделі
    public static class ModelComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.getModel().compareTo(o2.getModel());
        }
    }

    // сортування по типу двигуна
    public static class TypeEngineComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return o1.getTypeEngine().compareTo(o2.getTypeEngine());
        }
    }

    // сортування по обʼєму двигуна
    public static class CapacityEngineComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            if (o1.getCapacityEngine() > o2.getCapacityEngine())
                return 1;
            else if (o1.getCapacityEngine() < o2.getCapacityEngine())
                return -1;
            else return 0;
        }
    }
}
