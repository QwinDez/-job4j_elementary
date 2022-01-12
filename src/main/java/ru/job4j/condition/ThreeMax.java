package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = ThreeMax.max(10, 5, 1);
        System.out.println(result);
        result = ThreeMax.max(10, 50, 1);
        System.out.println(result);
        result = ThreeMax.max(1, 5, 100);
        System.out.println(result);
        result = ThreeMax.max(1, 1, 1);
        System.out.println(result);
        result = ThreeMax.max(10, 10, 1);
        System.out.println(result);
        result = ThreeMax.max(100, 1, 100);
        System.out.println(result);
        result = ThreeMax.max(1, 100, 100);
        System.out.println(result);
    }
}
