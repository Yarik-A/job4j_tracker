package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров: " + number);
    }

    @Override
    public double refill(int quantity) {
        return quantity * 59.90;
    }

    @Override
    public void move() {
        System.out.println("Автобус движется по трассе");
    }

    @Override
    public void boardingPlace() {
        System.out.println("Место посадки пассажиров: автовокзал");
    }
}
