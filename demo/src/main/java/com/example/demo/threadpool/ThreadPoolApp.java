package com.example.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolApp {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            Tarea tarea = new Tarea("Tarea " + i);
            executorService.submit(tarea);
        }
        executorService.shutdown();
    }
}
