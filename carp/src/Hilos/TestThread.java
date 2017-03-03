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
public class TestThread{
    public static void main(String[] args) {
    
        MiHilo mh = new MiHilo();
        Thread hilo1 = new Thread(mh);
        Thread hilo2 = new Thread(mh);
        Thread hilo3 = new Thread(mh);
        
        hilo1.setName("hilo [1]");
        hilo2.setName("hilo [2]");
        hilo3.setName("hilo [3]");
        
        System.out.println(" -- Inicia -- ");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        System.out.println(" -- Finaliza -- ");
    }
}
