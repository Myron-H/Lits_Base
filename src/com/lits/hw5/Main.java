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

        // Дані легкових авто і двигунів
        mercedes.dataCarMers();
        Engine engineMers = new Engine();
        engineMers.setSerialNumber("NNN80J");
        engineMers.setTypeEngine("electric");
        engineMers.setPowerEngine(4.6);
        engineMers.dataEngine();

        bmw.dataCarBmw();
        Engine engineBmw = new Engine();
        engineBmw.setSerialNumber("XX7JH8");
        engineBmw.setTypeEngine("gaz-gazoline");
        engineBmw.setPowerEngine(4.8);
        engineBmw.dataEngine();

        audi.dataCarAudi();
        Engine engineAudi = new Engine("564HJG", "gazoline", 3.6);
        engineAudi.setSerialNumber("564HJG");
        engineAudi.setTypeEngine("gazoline");
        engineAudi.setPowerEngine(3.6);
        engineAudi.dataEngine();

        // Вантажні авто
        Truck man = new Truck();
        Truck renault = new Truck();
        Truck scania = new Truck();

        // Гараж для вантажних авто з використанням Generics
        Garage<Truck> garageTruck = new Garage<>(man, renault, scania, engineTruck);
        garageTruck.nameGarage("Garage Trucks:");

        // Дані вантажних авто і двигунів
        man.dataTruckMan();
        Engine engineMan = new Engine();
        engineMan.setSerialNumber("KJJ988");
        engineMan.setTypeEngine("diesel");
        engineMan.setPowerEngine(14.6);
        engineMan.dataEngine();

        scania.dataTruckScania();
        Engine engineScania = new Engine();
        engineScania.setSerialNumber("MNN600");
        engineScania.setTypeEngine("diesel");
        engineScania.setPowerEngine(15.6);
        engineScania.dataEngine();

        renault.dataTruckRenault();
        Engine engineRenault = new Engine();
        engineRenault.setSerialNumber("LL700M");
        engineRenault.setTypeEngine("diesel");
        engineRenault.setPowerEngine(15.3);
        engineRenault.dataEngine();

        // Автобуси
        Bus neoplan = new Bus();
        Bus volvo = new Bus();
        Bus setra = new Bus();

        // Гараж для автобусів з використанням Generics
        Garage<Bus> garageBus = new Garage<>(neoplan, volvo, setra, engineBus);
        garageBus.nameGarage("Garage Bus:");

        // Дані автобусів і двигунів
        neoplan.dataBusNeoplan();
        Engine engineNeoplan = new Engine();
        engineNeoplan.setSerialNumber("LLO777");
        engineNeoplan.setTypeEngine("gaz-gazoline");
        engineNeoplan.setPowerEngine(12.6);
        engineNeoplan.dataEngine();

        volvo.dataBusVolvo();
        Engine engineVolvo = new Engine();
        engineVolvo.setSerialNumber("POK300");
        engineVolvo.setTypeEngine("electric");
        engineVolvo.setPowerEngine(10.9);
        engineVolvo.dataEngine();

        setra.dataBusSetra();
        Engine engineSetra = new Engine();
        engineSetra.setSerialNumber("JJ890L");
        engineSetra.setTypeEngine("gaz");
        engineSetra.setPowerEngine(14.2);
        engineSetra.dataEngine();

        // 3 різні типи авто для загаального гаражу
        Car toyota = new Car();
        Truck daf = new Truck();
        Bus ikarus = new Bus();

        // Гараж для різних типів авто з використанням Generics
        Garage<Auto> garageAuto = new Garage<>(toyota, daf, ikarus, engine);
        garageAuto.nameGarage("Garage AutoMix:");

        // Дані різних типів авто і двигунів
        toyota.dataCarToyota();
        Engine engineToyota = new Engine("JHG980", "gaz", 2.6);
        engineToyota.setSerialNumber("JHG980");
        engineToyota.setTypeEngine("gaz");
        engineToyota.setPowerEngine(2.6);
        engineToyota.dataEngine();

        daf.dataTruckDaf();
        Engine engineDaf = new Engine();
        engineDaf.setSerialNumber("KJH8LL");
        engineDaf.setTypeEngine("diesel");
        engineDaf.setPowerEngine(12.3);
        engineDaf.dataEngine();

        ikarus.dataBusIkarus();
        Engine engineIkarus = new Engine();
        engineIkarus.setSerialNumber("NMN033");
        engineIkarus.setTypeEngine("diesel");
        engineIkarus.setPowerEngine(10.2);
        engineIkarus.dataEngine();
    }
}