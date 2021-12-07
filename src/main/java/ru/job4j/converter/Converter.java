package ru.job4j.converter;

public class Converter {

    public static float rubleTEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2;
        float outEuro = Converter.rubleTEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passed);
        passed = expectedDollar == outDollar;
        System.out.println("140 rubles are 3. Test result : " + passed);
    }
}
