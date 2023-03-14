package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд движется по рельсам");
    }

    @Override
    public void boardingPlace() {
        System.out.println("Место посадки пассажиров: железнодорожный вокзал");
    }
}
