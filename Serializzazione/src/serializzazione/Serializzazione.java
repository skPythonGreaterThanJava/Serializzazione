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
        Studente studente = new Studente("Mimmo", "Carrozza", "69420");
        
        FileOutputStream uwu = new FileOutputStream("testpuntoser.ser");
        ObjectOutputStream sus = new ObjectOutputStream(uwu);
        sus.writeObject(69);
        sus.writeObject("°U°");
        sus.writeObject((float)4.20);
        sus.writeObject(false);
        
        sus.flush();
        uwu.flush();
        uwu.close();
        sus.close();
        
        FileInputStream owo = new FileInputStream("testpuntoser.ser");
        ObjectInputStream sos = new ObjectInputStream(owo);
        
        int valoreuno = (int) sos.readObject();
        System.out.println(valoreuno);
        String valoredue = (String) sos.readObject();
        System.out.println(valoredue);
        float valoretre = (float) sos.readObject();
        System.out.println(valoretre);
    }
    
}
