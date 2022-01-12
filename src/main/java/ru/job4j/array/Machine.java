package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] ints = new int[100];
        int size = 0;
        int cash = money - price;
        for (int coin : coins) {
            while (coin <= cash) {
                cash -= coin;
                ints[size] = coin;
                size++;
                }
            }
        return Arrays.copyOf(ints, size);
    }
}
