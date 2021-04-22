/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author sesana.federico
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
 
        
        FileOutputStream uwu = new FileOutputStream("testpuntoser.ser");
        ObjectOutputStream sus = new ObjectOutputStream(uwu);
//        sus.writeObject(studente);
//        sus.writeObject("°U°");
//        sus.writeObject((float)4.20);
//        sus.writeObject(false);
        
        sus.flush();
        uwu.flush();
        uwu.close();
        sus.close();
        Thread th = new Thread(new StudenteGenerator());
        th.start();
        
        FileInputStream owo = new FileInputStream("testpuntoser.ser");
        ObjectInputStream sos = new ObjectInputStream(owo);
        
//        Studente[] valoreuno = (Studente[]) sos.readObject();
//        for(int i = 0; i < 3; i++) {
//            System.out.println(valoreuno[i].toString());
//        }
//        String valoredue = (String) sos.readObject();
//        System.out.println(valoredue);
//        float valoretre = (float) sos.readObject();
//        System.out.println(valoretre);

        owo.close();
        sos.close();
    }
    
}
