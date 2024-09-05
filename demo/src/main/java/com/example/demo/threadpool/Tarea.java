package com.example.demo.threadpool;

public class Tarea implements Runnable{
    private String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println(nombre + " ejecutado en: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " completado en: " + Thread.currentThread().getName());

    }
}
