package ru.job4j.excersizes;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        }
        int size = 0;
        sortArray(left);
        sortArray(right);
        for (int i = 0; i < left.length; i++) {
            for (int k : right) {
                if (left[i] != k) {
                    left[size++] = left[i];
                }
            }
        }
        return Arrays.copyOf(left, size);
    }

    static void sortArray(int[] a) {
        int temp;
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
