package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error: " + active);
        System.out.println("Status: " + status);
        System.out.println("Description: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error badRequest = new Error(true, 400, "The request had bad syntax");
        Error forbidden = new Error(true, 403, "The request is for something forbidden");
        error.printInfo();
        System.out.println();
        badRequest.printInfo();
        System.out.println();
        forbidden.printInfo();
    }
}
