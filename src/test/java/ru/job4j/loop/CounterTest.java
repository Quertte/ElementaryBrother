package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Cinema;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom5To20Then104() {
        int start = 5;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 104;
        Assert.assertEquals(expected, result);
    }
}