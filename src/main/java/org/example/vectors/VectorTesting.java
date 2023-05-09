package org.example.vectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTesting {

    // Operations on ArrayList are not synchronized
    // Operations on Vector are synchronized, so you can operate on vectors with multiple threads at the same time
    // But instead of Vectors you can use Collections.synchronizedList(new ArrayList<>());
    // this creates a wrapper around your ArrayList

    public static void main(String[] args) throws InterruptedException {

        int size = 10000000;

         List<Integer> arraysList = new ArrayList<>();
         long start = System.currentTimeMillis();

         for (int i = 0; i < size; i++) {
             arraysList.add(i);
         }
         long end = System.currentTimeMillis();
         System.out.println("Added " + size + " elements to ArrayList: " + (end - start) + "ms");


        List<Integer> vector = new Vector<>();
        start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            vector.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to Vector: " + (end - start) + "ms");



        List<Integer> multiThreadedList = new ArrayList<>();
        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements in a multithreaded way to ArrayList: " + (end - start) + "ms");




        List<Integer> multiThreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedVector.add(i);
            }
        });

        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadedVector.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements in a multithreaded way to Vector: " + (end - start) + "ms");

    }




}
