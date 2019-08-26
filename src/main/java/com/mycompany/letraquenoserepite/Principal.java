/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.letraquenoserepite;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author SuperUs
 */
public class Principal {
    
        Scanner sc = new Scanner(System.in);
        private String cadena;
        private char[] caracter;
        Vector<Character> vector = new Vector<Character>();
        
        public char[] getCaracter() {
        return caracter;
        }

    public void setCaracter(char[] caracter) {
        this.caracter = caracter;
    }

    public String getCadena() {
        return cadena;
    }
   
    
    public String setCadena() {
        return cadena;
    }
    
    public Scanner getSc() {
        return sc;
    }

   
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public void inicio(){
        System.out.println("Ingrese la cadena: ");
        int lengarray, y = 1;
        char norepi;
        cadena = sc.nextLine();
        caracter = cadena.toCharArray();
        
        
         if(i>=caracter.length)
                break bucle1;
            lengarray = vector.size();
            for(int k=0; k<lengarray;k++){                               
                while(caracter[i]==vector.get(k)){
                    i++;
                    if(i>=caracter.length)
                        break bucle1;
                }
            }
    
    }
    
    }
    

