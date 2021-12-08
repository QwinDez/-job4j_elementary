package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalcucator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDiv(double first, double second) {
        return minus(second, first) + div(second, first);
    }

    public static double sumAllFunc(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + minus(second, first) + div(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сложения и умножения, равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления, равен: " + sumMinusAndDiv(10, 20));
        System.out.println("Результат расчета всех функций равен: " + sumAllFunc(10, 20));
    }

}
