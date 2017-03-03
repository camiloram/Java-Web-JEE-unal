/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carp;

/**
 *
 * @author Estudiante
 */
public class Punto {
    public static int x = 0;
    public static int y = 0;

    Punto() {
        System.err.println("-/-");
    }
    
    Punto(short x, short y) {
        this.x = x;
        this.y = y;
        System.err.println("s/s");
    }
    
    Punto(int x, int y) {
        this.x = x;
        this.y = y;
        System.err.println("i/i");
    }
    
    Punto(int x, short y) {
        this.x = x;
        this.y = y;
        System.err.println("i/s");
    }
    
    Punto(short x, int y) {
        this.x = x;
        this.y = y;
        System.err.println("s/i");
    }

    void getUbicacion() {
        System.err.println("[" + this.x + "],[" + this.y + "]");
    }
}
