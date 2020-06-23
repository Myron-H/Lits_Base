package com.lits.hw5;

public class Main {
    public static void main(String[] args) {

        // Легкові авто
        Car mercedes = new Car("MERCEDES", "A-Class", 2019, 2.250f, 320,
                256003, "gaz", 3.6);
        Car bmw = new Car("BMW", "X5", 2020, 2.560f, 360,
                568200, "diesel", 3.2);
        Car audi = new Car("AUDI", "A8", 2017, 2.600f, 340,
                568123, "gazoline", 4.2);

        // Гараж для легкових авто з використанням Generics
        Garage<Car> garageCar = new Garage<>(mercedes, bmw, audi);
        garageCar.nameGarage("Garage Cars:");

        // Дані легкових авто і двигуна
        mercedes.dataAuto();
        bmw.dataAuto();
        audi.dataAuto();

        // Вантажні авто
        Truck man = new Truck("MAN", "Welly", 2017, 28.500f, 120,
                125638, "diesel", 14.6);
        Truck renault = new Truck("RENAULT", "Marius", 2018, 29000, 130,
                258600, "diesel", 12.6);
        Truck scania = new Truck("SCANIA", "Century", 2019, 26000, 110,
                565289, "gaz", 14.8);

        // Гараж для вантажних авто з використанням Generics
        Garage<Truck> garageTruck = new Garage<>(man, renault, scania);
        garageTruck.nameGarage("Garage Trucks:");

        // Дані вантажних авто
        man.dataAuto();
        scania.dataAuto();
        renault.dataAuto();

        // Автобуси
        Bus neoplan = new Bus("NEOPLAN", "Trendliner", 2020, 22.500f, 110,
                500687, "diesel", 10.9);
        Bus volvo = new Bus("VOLVO", "Volvo 9900", 2018, 21.300f, 90,
                544123, "gaz", 11.8);
        Bus setra = new Bus("SETRA", "Kassbohrer", 2017, 21.400f, 120,
                900222, "gazoline", 10.9);

        // Гараж для автобусів з використанням Generics
        Garage<Bus> garageBus = new Garage<>(neoplan, volvo, setra);
        garageBus.nameGarage("Garage Bus:");

        // Дані автобусів
        neoplan.dataAuto();
        volvo.dataAuto();
        setra.dataAuto();

        // 3 різні типи авто для загаального гаражу
        Car toyota = new Car("TOYOTA", "Corolla", 2017, 2.400f, 280,
                458555, "electric", 2.6);
        Truck daf = new Truck("DAF", "XF900", 2018, 25.400f, 100,
                256344, "diesel", 12.6);
        Bus ikarus = new Bus("IKARUS", "Makador", 2019, 22.000f, 100,
                555700, "gaz", 14.8);

        // Гараж для різних типів авто з використанням Generics
        Garage<Auto> garageAuto = new Garage<>(toyota, daf, ikarus);
        garageAuto.nameGarage("Garage AutoMix:");

        // Дані різних типів авто
        toyota.dataAuto();
        daf.dataAuto();
        ikarus.dataAuto();

    }
}