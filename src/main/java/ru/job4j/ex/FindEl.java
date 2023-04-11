package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                return index;
            }
        }
        throw new ElementNotFoundException("Элемент не найден");
    }

    public static void main(String[] args) {
        try {
            String[] value = {"слива", "груша", "яблоко"};
            System.out.println(indexOf(value, ",банан"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
