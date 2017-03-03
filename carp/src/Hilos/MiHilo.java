/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author Estudiante
 */
class MiHilo implements Runnable {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public void run(){
        String color = ANSI_BLUE;
        for (int i = 0; i < 2000; i++) {
            if(Thread.currentThread().getName().equals("hilo [1]")){
                color = ANSI_GREEN;
            } else if(Thread.currentThread().getName().equals("hilo [2]")){
                color = ANSI_RED;
            }
            
            System.out.println(color + "corriendo " + Thread.currentThread().getName() + ", i es " + i);
        }
    }
}
