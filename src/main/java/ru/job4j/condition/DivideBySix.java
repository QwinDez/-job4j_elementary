package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0 && number % 2 == 0) {
            result = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            result = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            result = "Исходное число не делится на 3, но является четным.";
        } else {
            result = "Исходное число не делится на 3 и не является четным.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = DivideBySix.checkNumber(6);
        System.out.println(result);
        result = DivideBySix.checkNumber(9);
        System.out.println(result);
        result = DivideBySix.checkNumber(14);
        System.out.println(result);
        result = DivideBySix.checkNumber(25);
        System.out.println(result);
    }
}


