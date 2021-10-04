package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 115) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short heightWoman = 160;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 160 is " + woman);
    }
}
