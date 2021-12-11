package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(21, 12, 10);
        System.out.println(result);
        result = Triangle.exist(0, 0, 0);
        System.out.println(result);
    }
}
