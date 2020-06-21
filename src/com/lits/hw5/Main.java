package com.lits.hw5;

public class Main {
    public static void main(String[] args) {

        // Двигуни для різних типів авто
        Engine engine = new Engine();
        Engine engineCar = new Engine();
        Engine engineBus = new Engine();
        Engine engineTruck = new Engine();

        // Легкові авто
        Car mercedes = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        // Гараж для легкових авто з використанням Generics
        Garage<Car> garageCar = new Garage<>(mercedes, bmw, audi, engineCar);
        garageCar.nameGarage("Garage Cars:");

        // Дані легкових авто
        mercedes.dataCarMers();
        bmw.dataCarBmw();
        audi.dataCarAudi();

        // Вантажні авто
        Truck man = new Truck();
        Truck renault = new Truck();
        Truck scania = new Truck();

        // Гараж для вантажних авто з використанням Generics
        Garage<Truck> garageTruck = new Garage<>(man, renault, scania, engineTruck);
        garageTruck.nameGarage("Garage Trucks:");

        // Вантажні авто
        man.dataTruckMan();
        man.dataTruckScania();
        man.dataTruckRenault();

        // Автобуси
        Bus neoplan = new Bus();
        Bus volvo = new Bus();
        Bus setra = new Bus();

        // Гараж для автобусів з використанням Generics
        Garage<Bus> garageBus = new Garage<>(neoplan, volvo, setra, engineBus);
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
        Garage<Auto> garageAuto = new Garage<>(toyota, daf, ikarus, engine);
        garageAuto.nameGarage("Garage AutoMix:");

        // Дані різних авто
        toyota.dataCarToyota();
        daf.dataTruckDaf();
        ikarus.dataBusIkarus();
    }
}