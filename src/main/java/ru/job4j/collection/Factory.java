package ru.job4j.collection;

import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth", "sixth");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
