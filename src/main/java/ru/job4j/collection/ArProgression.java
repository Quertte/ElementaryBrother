package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int result =  data.stream().reduce(Integer::sum).orElse(0);
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                result = 0;
                break;
            }
        }
        return  result;
    }
}
