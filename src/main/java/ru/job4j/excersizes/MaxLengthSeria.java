package ru.job4j.excersizes;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int num = 1;
        for (int i = 1; i < array.length; i++) {
            count = array[i - 1] <= array[i] ? ++count : 1;
            if (count > 1) {
                num = count;
            }
        }
        return num;
    }
}
