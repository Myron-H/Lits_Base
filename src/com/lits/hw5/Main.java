package com.lits.hw5;

public class Main {
    public static void main(String[] args) {

        // Двигуни для різних типів авто
        Engine engine = new Engine();

        // Легкові авто
        Car mercedes = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        // Гараж для легкових авто з використанням Generics
        Garage<Car> garageCar = new Garage<>(mercedes, bmw, audi);
        garageCar.nameGarage("Garage Cars:");

        // Дані легкових авто і двигуна
        mercedes.dataCarMers();
        bmw.dataCarBmw();
        audi.dataCarAudi();

        // Вантажні авто
        Truck man = new Truck();
        Truck renault = new Truck();
        Truck scania = new Truck();

        // Гараж для вантажних авто з використанням Generics
        Garage<Truck> garageTruck = new Garage<>(man, renault, scania);
        garageTruck.nameGarage("Garage Trucks:");

        // Дані вантажних авто
        man.dataTruckMan();
        scania.dataTruckScania();
        renault.dataTruckRenault();

        // Автобуси
        Bus neoplan = new Bus();
        Bus volvo = new Bus();
        Bus setra = new Bus();

        // Гараж для автобусів з використанням Generics
        Garage<Bus> garageBus = new Garage<>(neoplan, volvo, setra);
        garageBus.nameGarage("Garage Bus:");

        // Дані автобусів
        neoplan.dataBusNeoplan();
        volvo.dataBusVolvo();
        setra.dataBusSetra();

        // 3 різні типи авто для загаального гаражу
        Car toyota = new Car();
        Truck daf = new Truck();
        Bus ikarus = new Bus();

        // Гараж для різних типів авто з використанням Generics
        Garage<Auto> garageAuto = new Garage<>(toyota, daf, ikarus);
        garageAuto.nameGarage("Garage AutoMix:");

        // Дані різних типів авто
        toyota.dataCarToyota();
        daf.dataTruckDaf();
        ikarus.dataBusIkarus();

    }
}