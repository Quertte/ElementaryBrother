package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        StringBuilder sb = new StringBuilder();
        String[] mas = s.split("");
        List<String> list = Arrays.asList(mas);
        list.sort((String::compareTo));
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
}
