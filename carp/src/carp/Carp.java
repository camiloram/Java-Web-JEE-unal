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
public class Carp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            throw new Exception();
        } catch (Exception e) {
            System.err.println("jjj");
                   
        }        
        
        Punto p1 = new Punto();
        Punto p2 = new Punto(2,3);
        
        Punto p3 = new Punto((short)2,3);
        Punto p4 = new Punto(2,(short)3);
        Punto p5 = new Punto((short)2,(short)3);
        
        p1.getUbicacion();
        p2.getUbicacion();
        
        System.err.println(Punto.x);
        
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
//        m5.go();        

        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;

    }
    
}
