package ru.job4j.excersizes;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        int k = 0;
        int space = 0;
        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1) {
                ++space;
                result[k] = new char[space];
            }
            if (str[i] == c) {
                commonCount++;
                result[k++] = new char[space];
                space = 0;
            } else if (str[i] != c) {
                ++space;
            }
        }
        int p = 0;
        for (int i = 0; i < commonCount; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (str[p] != c) {
                    result[i][j] = str[p++];
                } else {
                    p++;
                    j = -1;
                }
            }
        }
        return Arrays.copyOf(result, commonCount);
    }

    private String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }
}
