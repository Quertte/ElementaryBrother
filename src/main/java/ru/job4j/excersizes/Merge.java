package ru.job4j.excersizes;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
                    rsl[i] = left[l++];
                } else {
                    rsl[i] = right[r++];
                }
            } else if (l < left.length) {
                rsl[i] = left[l++];
            } else if (r < right.length) {
                rsl[i] = right[r++];
            }
        }
        return rsl;
    }
}
