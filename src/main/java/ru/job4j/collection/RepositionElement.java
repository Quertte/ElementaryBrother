package ru.job4j.collection;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        if (index < list.size()) {
            String deleted = list.remove(list.size() - 1);
            list.set(index, deleted);
        } else {
            list.remove(list.size() - 1);
        }
        return list;
    }
}
