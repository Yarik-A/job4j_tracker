package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calc(n - 1);
        }
    }

    public static void main(String[] args) {
        int rsl = calc(1);
        System.out.println(rsl);
    }
}
