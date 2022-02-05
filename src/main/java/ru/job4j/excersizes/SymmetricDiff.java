package ru.job4j.excersizes;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        if (Arrays.equals(left, right)) {
            return new int[0];
        } else if (right.length == 0) {
            return left;
        } else if (left.length == 0) {
            return right;
        }
        int[] rsl = new int[left.length + right.length];
        int size = 0;
        sortArray(left);
        sortArray(right);
        int l = 0;
        int r = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l < left.length && r < right.length) {
                if (left[l] == right[r]) {
                    l++;
                    r++;
                } else if (left[l] < right[r]) {
                    rsl[size++] = left[l++];
                } else if (left[l] > right[r]) {
                    rsl[size++] = right[r++];
                }
            } else if (l < left.length) {
                rsl[size++] = left[l++];
            } else if (r < right.length) {
                rsl[size++] = right[r++];
            }
        }
        return Arrays.copyOf(rsl, size);
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
