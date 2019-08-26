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
        int tamanoarray, y = 1;
        char norepite;
        cadena = sc.nextLine();
        caracter = cadena.toCharArray();
        bucle1:
        for(int i=0;i<caracter.length;i++){
        
         if(i>=caracter.length)
                break bucle1;
            tamanoarray = vector.size();
            for(int k=0; k<tamanoarray;k++){                               
                while(caracter[i]==vector.get(k)){
                    i++;
                    if(i>=caracter.length)
                        break bucle1;
                }
            }
            norepite=caracter[i];
            bucle3:
            for(int j=y;j<caracter.length;j++){
                System.out.println("* Leyendo " + caracter[j]);
                System.out.println("- La primera que no se repites es: " + norepite);
                if(caracter[i]==caracter[j]){
                    y=j+1;
                    vector.add(caracter[i]);
                    break bucle3;
                }
                if(j >= (caracter.length)-1 )
                    break bucle1;    
            }
    
    }
    }
}
    
    
    

