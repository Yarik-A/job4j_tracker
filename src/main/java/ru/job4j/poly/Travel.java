package ru.job4j.poly;

public class Travel {

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle[] vehicles = {bus, train, plane};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.boardingPlace();
        }
    }
}
