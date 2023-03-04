package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Happy english", 346);
        Book book2 = new Book("Clean code", 384);
        Book book3 = new Book("Forecasting: Principles and Practice", 305);
        Book book4 = new Book("Math for programmers", 655);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + ", " + book.getPages() + " pages");
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + ", " + book.getPages() + " pages");
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ", " + book.getPages() + " pages");
            }
        }

    }
}
