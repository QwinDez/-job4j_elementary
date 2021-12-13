package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
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


