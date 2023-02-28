package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {

    @Test
    public void when23To20Then3() {
        Point a = new Point(2, 3);
        Point b = new Point(2, 0);
        double expected = 3;
        double rsl = a.distance(b);
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when22To62Then4() {
        Point a = new Point(2, 2);
        Point b = new Point(6, 2);
        double expected = 4;
        double rsl = a.distance(b);
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when29To66Then5() {
        Point a = new Point(2, 9);
        Point b = new Point(6, 6);
        double expected = 5;
        double rsl = a.distance(b);
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when222To622Then4() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(6, 2, 2);
        double expected = 4;
        double rsl = a.distance3d(b);
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when246To4810Then6() {
        Point a = new Point(2, 4, 6);
        Point b = new Point(4, 8, 10);
        double expected = 6;
        double rsl = a.distance3d(b);
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}