package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] shorts = new short[10];
        String[] strings = new String[100500];
        String[] names = new String[4];
        names[0] = "Denis";
        names[1] = "Petr";
        names[2] = "Alex";
        names[3] = "Den";
        float[] number = new float[40];
        System.out.println("Размер массива равен: " + shorts.length);
        System.out.println("Размер массива равен: " + strings.length);
        System.out.println("Размер массива равен: " + number.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
