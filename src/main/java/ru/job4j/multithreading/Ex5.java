package ru.job4j.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.setName("moy_potok");
        thread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of my thread5 = " + thread5.getName()
                + " Priority of my thread = " + thread5.getPriority());

    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("privat");
    }
}
