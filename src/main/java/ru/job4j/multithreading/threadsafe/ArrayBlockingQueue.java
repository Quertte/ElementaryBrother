package ru.job4j.multithreading.threadsafe;

public class ArrayBlockingQueue {
    public static void main(String[] args) {
        java.util.concurrent.ArrayBlockingQueue<Integer> queue =
                new java.util.concurrent.ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);
        System.out.println(queue);
    }

}
