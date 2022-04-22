package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        List<String> expected = new ArrayList<>();
        return list.indexOf(el) != list.lastIndexOf(el) ?
                list.subList(list.indexOf(el), list.lastIndexOf(el)) : expected;
    }
}
