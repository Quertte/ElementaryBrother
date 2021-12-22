package ru.job4j.excersizes;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        } else if (left.length == 0) {
            return right;
        } else if (Arrays.equals(left, right)) {
            return new int[0];
        }
        int[] rsl = new int[left.length + right.length];
        System.arraycopy(left, 0, rsl, 0, left.length);
        System.arraycopy(right, 0, rsl, left.length, right.length);
        int size = 0;
        sortArray(rsl);
        int unique = countUniqueValues(rsl);
        int[] result = new int[unique];
        for (int i = 0; i < rsl.length; i++) {
            result[size++] = rsl[i];
            while (i + 1 < rsl.length && rsl[i] != rsl[i + 1]) {
                i++;
            }
        }
        return result;
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

    static int countUniqueValues(int[] a) {
        int unique = a.length;
        for (int i = 0; i < a.length; i++) {
            while (i + 1 < a.length && a[i] == a[i + 1]) {
                i++;
                unique--;
            }
        }
        return unique;
    }
}
