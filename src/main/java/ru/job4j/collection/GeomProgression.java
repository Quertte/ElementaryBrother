package ru.job4j.collection;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += first;
            first *= denominator;
        }
        return sum;
    }
}
