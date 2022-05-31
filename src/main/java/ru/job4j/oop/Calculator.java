package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumOfOperation(int summa) {
        return sum(summa) + minus(summa) + divide(summa) + multiply(summa);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int resultOfMinus = minus(20);
        System.out.println(resultOfMinus);
        int resultOfDivide = calculator.divide(25);
        System.out.println(resultOfDivide);
        int resultOfSum = calculator.sumOfOperation(20);
        System.out.println(resultOfSum);
    }
}
