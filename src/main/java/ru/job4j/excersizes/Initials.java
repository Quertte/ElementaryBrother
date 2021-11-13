package ru.job4j.excersizes;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder rsl = new StringBuilder(fio[0] + " ");
        for (int i = 1; i < fio.length; i++) {
            rsl.append(fio[i].charAt(0)).append(".");
        }
        return rsl.toString();
    }
}
