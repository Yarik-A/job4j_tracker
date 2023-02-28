package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        System.out.println("Сумма: " + sum(5));
        System.out.println("Разность: " + minus(12));
        Calculator calc = new Calculator();
        System.out.println("Умножение: " + calc.multiply(2));
        System.out.println("Деление: " + calc.divide(20));
        System.out.println("Сумма всех операций: " + calc.sumAllOperation(5));
    }
}
