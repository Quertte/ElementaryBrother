package ru.job4j;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(int age) {
        System.out.println("age = " + age);
    }

    public static void hello(int age, String name) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 33;
        ArgMethod.hello(name);
        ArgMethod.hello(name, age);
        ArgMethod.hello(age);
        ArgMethod.hello(age, name);
    }
}
