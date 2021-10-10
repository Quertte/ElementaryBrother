package ru.job4j.excersizes;

public class CrossArray {
    public static void printCrossE1(int[] left, int[] right) {
        for (int i = 0; i < Math.min(left.length, right.length); i++) {
            for (int j = 0; j < Math.min(left.length, right.length); j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }
            }
        }
    }
}
