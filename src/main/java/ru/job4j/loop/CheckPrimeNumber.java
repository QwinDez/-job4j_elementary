package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 1; index <= number; index++) {
            if ((index % number) == 0) {
                break;
            } else {
                prime = false;
            }
        }
        return prime;
    }
}
