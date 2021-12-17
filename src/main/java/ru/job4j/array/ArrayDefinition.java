package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] element = new short[10];
        String[] strings = new String[100500];
        float[] number = new float[40];
        System.out.println("Размер массива равен: " + element.length);
        System.out.println("Размер массива равен: " + strings.length);
        System.out.println("Размер массива равен: " + number.length);
    }
}
