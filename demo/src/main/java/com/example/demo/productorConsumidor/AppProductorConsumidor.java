package com.example.demo.productorConsumidor;

public class AppProductorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);

        Thread producctor = new Thread(new Productor(buffer));
        Thread consumidor = new Thread(new Consumidor(buffer));

        producctor.start();
        consumidor.start();


    }
}
