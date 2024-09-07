package com.example.demo.productorConsumidor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {
    private BlockingQueue<Integer> buffer;
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayBlockingQueue<>(capacity);
    }

    public  void producir(int valor) throws InterruptedException {
        buffer.put(valor);
        System.out.println("Producir valor: " + valor);
    }

    public int consumir() throws InterruptedException {
        int valor = buffer.take();
        System.out.println("Consumir valor: " + valor);
        return valor;
    }

}
