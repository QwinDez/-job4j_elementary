package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result1 = Max.max(1, 2);
        System.out.println(result1);
        result1 = Max.max(5, 5);
        System.out.println(result1);
    }
}
