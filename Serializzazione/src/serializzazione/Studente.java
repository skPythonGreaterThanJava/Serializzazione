/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author sesana.federico
 */
public class Studente implements Serializable{
    String nome, cognome;
    int numero;

    public Studente(String nome, String cognome, int numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "\nCognome: " + cognome + "\nNumero: " + numero;
    }
}
