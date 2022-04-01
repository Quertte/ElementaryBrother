package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!check.contains(str)) {
            list.add(index, str);
        }
        return check.size() != list.size();
    }
}
