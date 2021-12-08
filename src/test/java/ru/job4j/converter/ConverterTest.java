package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;                             // Входящие данные
        float expected = 2;                         // Ожидаемые данные
        float out = Converter.rubleTEuro(in);       // Результат вычисления
        float eps = 0.0001f;                        // Точность сравнения
        Assert.assertEquals(expected, out, eps);    // Метод сравнение данных
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}