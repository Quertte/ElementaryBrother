package ru.job4j.excersizes;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[Math.min(left.length, right.length)];
        int size = 0;
        for (int l : left) {
            for (int r : right) {
                if (l == r) {
                    rsl[size++] = l;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
