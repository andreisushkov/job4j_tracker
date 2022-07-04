package ru.job4j.poly;

import java.util.Scanner;

public class Bus implements Transport {
    @Override
    public void drive() {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println("We are going to " + city);
    }

    @Override
    public void passengers(int passengersNumber) {
        Scanner scanner = new Scanner(System.in);
        passengersNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("We have " + passengersNumber + " people in the car");

    }

    @Override
    public int refuel(int fuel, int cost) {
        Scanner scanner = new Scanner(System.in);
        fuel = Integer.parseInt(scanner.nextLine());
        cost = 45;
        System.out.println("Cost of refuel is: " + cost + " dollars");
        System.out.println("Need to refuel "  + fuel + " litres");
        if (fuel != 0) {
            cost *= fuel;
            System.out.println("Pay " + cost + " dollars");
        } else {
            System.out.println("Tell me how many litres to fill!");
        }
        return cost;
    }
}
