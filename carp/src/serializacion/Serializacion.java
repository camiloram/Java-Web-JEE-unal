/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import carp.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Estudiante
 */
public class Serializacion {

    public static void main(String[] args) {
        PuntoSer punto = new PuntoSer();
        punto.x = 5;
        punto.y = 3;
        
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(punto);
            os.close();
            System.out.println("(antes de serializar) punto x = " + punto.x);
            
            punto = null;
            
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            punto = (PuntoSer) ois.readObject();
            ois.close();
            System.out.println("(despues de serializar) punto x = " + punto.x);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
    }
}
