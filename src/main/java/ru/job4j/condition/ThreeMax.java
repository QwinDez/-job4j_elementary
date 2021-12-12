package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (first == second && first > third) {
            result = first;
        }
        if (third > first && third > second) {
            result = third;
        }
        if (second == third && second > first) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int result1 = ThreeMax.max(10, 5, 1);
        System.out.println(result1);
        result1 = ThreeMax.max(10, 50, 1);
        System.out.println(result1);
        result1 = ThreeMax.max(1, 5, 100);
        System.out.println(result1);
        result1 = ThreeMax.max(1, 1, 1);
        System.out.println(result1);
        result1 = ThreeMax.max(10, 10, 1);
        System.out.println(result1);
        result1 = ThreeMax.max(100, 1, 100);
        System.out.println(result1);
        result1 = ThreeMax.max(1, 100, 100);
        System.out.println(result1);
    }
}
