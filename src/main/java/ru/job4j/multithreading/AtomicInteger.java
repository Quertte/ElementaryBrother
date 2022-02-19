package ru.job4j.multithreading;

public class AtomicInteger {
    // static int counter;

    static java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);

    public static void increment() {
        atomicInteger.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl118());
        Thread thread2 = new Thread(new MyRunnableImpl118());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(atomicInteger);
    }
}

class MyRunnableImpl118 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicInteger.increment();
        }
    }
}