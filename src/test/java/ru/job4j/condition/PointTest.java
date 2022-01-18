package ru.job4j.condition;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26to23then3() {
        double expected = 3;
        int x1 = 2;
        int y1 = 6;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to32then1() {
        double expected = 1;
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to32then1() {
        double expected = 1;
        int x1 = 4;
        int y1 = 2;
        int x2 = 3;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5dot19() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double result = a.distance3d(b);
        assertThat(result, closeTo(5.19, 0.01));
    }

    @Test
    public void when12to34then2dot83() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double result = a.distance(b);
        assertThat(result, closeTo(2.83, 0.01));
    }
}