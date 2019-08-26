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
        
        /**
         *  get de la variable caracter
         * @return caracter
         */
        public char[] getCaracter() {
            return caracter;
        }

        /**
         * set de la variable caracter
         * @param caracter 
         */
        public void setCaracter(char[] caracter) {
            this.caracter = caracter;
        }
        /**
         * get de la variable cadena
         * @return cadena
         */
        public String getCadena() {
            return cadena;
        }

        /**
         * set de la Varibale cadena
         * @return cadena
         */
        public String setCadena() {
            return cadena;
        }

        /**
         * get de la variable sc
         * @return sc
         */
        public Scanner getSc() {
            return sc;
        }

        /**
         * set de la variable sc
         * @param sc 
         */
        public void setSc(Scanner sc) {
            this.sc = sc;
        }

    /**
     * Metodo de inicio de la aplicacion la cual pide la cadena
     * la convierte en un vector de caracteres
     * busca y en cuentra la primera letra que se repite
     * y la va comparando una a una con el vector de la cadena.
     */
    
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
    
    
    

