package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {0, 3, 5, 7, 9, 11, 13};
        int source = 1;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 11, 5, 7, 9, 3, 13};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {0, 3, 5, 7, 9, 11};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 3, 7, 5, 9, 11};
        Assert.assertArrayEquals(result, expected);
    }
}