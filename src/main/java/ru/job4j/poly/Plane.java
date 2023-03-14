package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху");
    }

    @Override
    public void boardingPlace() {
        System.out.println("Место посадки пассажиров: аэропорт");
    }
}
