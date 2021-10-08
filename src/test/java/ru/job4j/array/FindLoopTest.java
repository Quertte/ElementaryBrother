package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayNotFind() {
        int[] data = {5, 3, 4, 1, 10};
        int e1 = 0;
        int result = FindLoop.indexOf(data, e1);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }
}