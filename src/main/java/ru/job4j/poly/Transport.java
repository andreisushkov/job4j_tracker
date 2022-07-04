package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int passengersNumber);

    int refuel(int fuel, int cost);
}
