package ru.job4j.multithreading.threadsafe;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        java.util.concurrent.ArrayBlockingQueue<Integer> queue =
                new java.util.concurrent.ArrayBlockingQueue<>(4);
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.offer(++i);
                    System.out.println("Producer dobavil chislo:  " + i + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer zabral: " + j + " " + queue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
