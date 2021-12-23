package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int index = left.length - 1; index <= left.length - 1; index++) {
            if (left[index] == right[index]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
