package ru.job4j.multithreading;

public class DeadLockEx {
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread 10: попытка захватить монитор LOCK1");
        synchronized (DeadLockEx.LOCK1) {
            System.out.println("Thread 10: монитор объекта LOCK1 захвачен");
            System.out.println("Thread 10: попытка захватить монитор LOCK2");
            synchronized (DeadLockEx.LOCK2) {
                System.out.println("Мониторы объектов LOCK1 и LOCK2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread 20: попытка захватить монитор LOCK2");
        synchronized (DeadLockEx.LOCK2) {
            System.out.println("Thread 20: монитор объекта LOCK2 захвачен");
            System.out.println("Thread 20: попытка захватить монитор LOCK1");
            synchronized (DeadLockEx.LOCK1) {
                System.out.println("Мониторы объектов LOCK1 и LOCK2 захвачены");
            }
        }
    }
}
