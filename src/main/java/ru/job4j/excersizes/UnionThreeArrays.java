package ru.job4j.excersizes;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[2 + middle.length / 2 + right.length / 2];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];
        for (int i = 1, j = 0, k = 0; i < rsl.length - 1; i++, j++, k++) {
            if (j % 2 != 0 && i % 2 == 0) {
                rsl[i] = middle[j];
            } else if (k % 2 == 0 && i % 2 != 0) {
                rsl[i] = right[k];
            }
        }
        return rsl;
    }
}
