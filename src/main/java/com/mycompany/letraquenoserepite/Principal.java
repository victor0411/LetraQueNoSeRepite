/*
 * Clase Principal contiene el metodo inicio
 *
 * 
 */
package com.mycompany.letraquenoserepite;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author Victor Preciado
 * @author Edward Ramos
 */
public class Principal {
         /**
          * sc : Variable que instancea Scanner para poder capturar datos por consola
          */
        Scanner sc = new Scanner(System.in);
        /**
          * cadena : Variable que captura la cadena que el usuario digita
          */
        private String cadena;
        /**
          * caracter : Variable que va a tener la cadena en forma de array
          */
        private char[] caracter;
        /**
          * vector : variable con la cual se compara por si acaso una letra aparece repetida despues
          */
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
    

