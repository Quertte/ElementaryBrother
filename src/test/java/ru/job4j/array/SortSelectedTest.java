package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = {10, 5, 2, -1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {-1, 2, 5, 5, 10};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void whenSort3() {
        int[] data = {10, 2, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = {-1, 2, 10};
        Assert.assertArrayEquals(result, expected);
    }
}