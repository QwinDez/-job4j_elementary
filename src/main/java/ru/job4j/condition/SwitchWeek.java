package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресение";
            default -> "Ошибка";
        };
    }

    public static void main(String[] args) {
        String result = SwitchWeek.nameOfDay(2);
        System.out.println(result);
        result = SwitchWeek.nameOfDay(8);
        System.out.println(result);
    }
}
