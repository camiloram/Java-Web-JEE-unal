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
class Mixer {

    Mixer(){
    }
    
    Mixer(Mixer m){
        m1 = m;
    }
    
    Mixer m1;

    void go() {
        System.err.println("hi ");
    }
}
