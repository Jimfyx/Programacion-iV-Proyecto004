package com.example.demo.threadpool;

import com.example.demo.productorConsumidor.Buffer;
import com.example.demo.productorConsumidor.Consumidor;
import com.example.demo.productorConsumidor.Productor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppProductorConsumidorThreadPool {

    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(10);
        int hiloProductor = 4;
        int hiloConsumidor = 4;

        ExecutorService executorServiceProductor = Executors.newFixedThreadPool(1);
        for (int i = 0; i < hiloProductor; i++) {
            Productor productor = new Productor(buffer);
            executorServiceProductor.submit(productor);
            System.out.println("Productor " + i + ": " + productor);
        }

        ExecutorService executorServiceConsumidor = Executors.newFixedThreadPool(1);
        for (int i = 0; i < hiloConsumidor; i++) {
            Consumidor consumidor = new Consumidor(buffer);
            executorServiceConsumidor.submit(consumidor);
            System.out.println("Consumidor " + i + ": " + consumidor);
        }
        executorServiceProductor.shutdown();
        executorServiceConsumidor.shutdown();
    }

}
