/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sesana.federico
 */
public class StudenteGenerator implements Runnable{
    public String[] names = {"Gimmi", "Maurizio", "Pippona", "Gervasa", "Peracotta"};
    public String[] surnames = {"Carrello", "Parra", "Cocomero", "Melacotta", "sium"};

    public StudenteGenerator() {
        
    }

    @Override
    public void run() {
        while(true){
            Studente mimmo = new Studente(names[(int) (Math.random()*4)], surnames[(int)(Math.random()*4)], (int)(Math.random()*31 + 1));
            System.out.println(mimmo);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(StudenteGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
}
