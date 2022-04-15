package ru.job4j.collection;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        int index = 0;
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
            index = left.indexOf(str);
        } else if(left.contains(str)) {
            index = left.indexOf(str);
        } else {
            index = right.indexOf(str);
        }
        return index;
    }
}
