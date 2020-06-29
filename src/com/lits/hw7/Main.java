package com.lits.hw7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Кастомний LinkedList
        LinkedCustom<String> linkedCustom = new LinkedCustom<>();
        linkedCustom.addFirst("First");
        linkedCustom.addLast("Last");
        System.out.println(linkedCustom.size());
        System.out.println(linkedCustom.getIndex(0));
        System.out.println(linkedCustom.getIndex(1));

        // Колекція Car
        List<Car> cars = new ArrayList<>();
        Car mers = new Car("MERS", "Class", 2018, "diesel", 3.8f);
        Car bmw = new Car("BMW", "X7", 2020, "electric", 4.2f);
        Car audi = new Car("AUDI", "A8", 2019, "gazoline", 4.0f);
        cars.add(mers);
        cars.add(bmw);
        cars.add(audi);

        // Компаратори для сортування різних полів
        Comparator<Car> sortedName = new CustomComparator.NameComparator();
        // Для сортування у зворотньому напрямку використав метод reversed()
        Comparator<Car> sortedNameReverse = new CustomComparator.NameComparator().reversed();
        Comparator<Car> sortedModel = new CustomComparator.ModelComparator();
        Comparator<Car> sortedModelReverse = new CustomComparator.ModelComparator().reversed();
        Comparator<Car> sortedYear = new CustomComparator();
        Comparator<Car> sortedYearReverse = new CustomComparator().reversed();
        Comparator<Car> sortedTypeEngine = new CustomComparator.TypeEngineComparator();
        Comparator<Car> sortedTypeEngineReverse = new CustomComparator.TypeEngineComparator();
        Comparator<Car> sortedCapacityEngine = new CustomComparator.CapacityEngineComparator();

        System.out.print("Сортування по імені:");
        cars.sort(sortedName);
        System.out.println(cars);

        System.out.print("Сортування по імені по спаданню:");
        cars.sort(sortedNameReverse);
        System.out.println(cars);

        System.out.print("Сортування по моделі:");
        cars.sort(sortedModel);
        System.out.println(cars);

        System.out.print("Сортування по моделі по спаданню:");
        cars.sort(sortedModelReverse);
        System.out.println(cars);

        System.out.print("Сортування по року:");
        cars.sort(sortedYear);
        System.out.println(cars);

        System.out.print("Сортування по року по спаданню:");
        cars.sort(sortedYearReverse);
        System.out.println(cars);

        System.out.print("Сортування по типу двигуна:");
        cars.sort(sortedTypeEngine);
        System.out.println(cars);

        System.out.print("Сортування по типу двигуна по спаданню:");
        cars.sort(sortedTypeEngineReverse);
        System.out.println(cars);

        System.out.print("Сортування по обʼєму двигуна:");
        cars.sort(sortedCapacityEngine);
        System.out.println(cars);

        System.out.print("Сортування по обʼєму двигуна по спаданню:");
        cars.sort(sortedCapacityEngine.reversed());
        System.out.println(cars);
    }
}
