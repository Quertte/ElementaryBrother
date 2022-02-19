package ru.job4j.multithreading.threadsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Zaur");
        map.put(2, "Oleg");
        map.put(3, "Ivan");
        map.put(4, "Sergey");
        map.put(5, "Egor");
        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable1 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();
        thread1.start();
        thread.join();
        thread.join();
        System.out.println(map);
    }
}
