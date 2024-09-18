

package main;

import java.util.Random;
import java.util.Scanner;


public class Project4 {

    public static void main(String[] args) {
        final byte MAX_INTENTOS = 10;
        final byte LARGO_CODIGO = 5;
        final char PRIMERA_LETRA = 'A';
        final char ULTIMA_LETRA = 'H';
        int rango = (int)ULTIMA_LETRA - (int)PRIMERA_LETRA;
        int a, b, r, jugando =1, resultado=0;
        char apoyo;
        char[] check = new char[LARGO_CODIGO];
        boolean[] evaluadasP= new boolean[LARGO_CODIGO],
         evaluadasA= new boolean[LARGO_CODIGO];
        String[] tocheck;
        Random sorteo = new Random();
        Scanner entrada = new Scanner(System.in);
        
        
        for (int i = 0; i < LARGO_CODIGO; i++) {
            evaluadasP[i]= false;
            evaluadasA[i]= false;
        }
        
        
        for (int i = 0; i < LARGO_CODIGO; i++) {
            apoyo=(char)(sorteo.nextInt(rango)+((int)PRIMERA_LETRA));
            check[i] = apoyo;
        }     
        /*
        check[0]='A';
        check[1]='B';
        check[2]='A';
        check[3]='C';
        check[4]='B';
        */
        
        /*
        for (int i = 0; i < LARGO_CODIGO; i++) {
            System.out.print(check[i]);
        }
        */
        

        a=0;       
        System.out.println("");
        System.out.println("Dispones de 10 intentos para adivinar el codigo.");
        while(jugando==1){
            b=0;
            r=0;
            for (int i = 0; i < LARGO_CODIGO; i++) {
                evaluadasP[i]= false;
                evaluadasA[i]= false;
            }
            System.out.print("Codigo "+(a+1)+" de 10>>");
            System.out.println("Ingresa: ");
            tocheck = (entrada.nextLine()).split("");
            
            for (int i = 0; i < LARGO_CODIGO; i++) {
                if (tocheck[i].equals(String.valueOf(check[i]))) {
                    b++;
                    evaluadasP[i]= true;
                    evaluadasA[i]= true;
                }
            }
            
            for (int i = 0; i < LARGO_CODIGO; i++) {
                for (int j = 0; j < LARGO_CODIGO; j++) {
                    if (i!=j) {
                        if(evaluadasP[j] == false && evaluadasA[i]== false){
                            if (tocheck[i].equals(String.valueOf(check[j]))) {
                                r++;
                                evaluadasP[j]= true;
                                evaluadasA[i]= true;
                            
                            }
                        
                        }
                        
                    }


                }
            }
            

            
            System.out.println("B= "+b+" R= "+r);
            
            if(b==LARGO_CODIGO){
                jugando=0;
                resultado=1;
            }
            

            a++;
            if(MAX_INTENTOS==a){
            jugando=0;
            }
        }

        if(resultado==1){
            System.out.println("EXCELENTE!!! Ganaste.");
        } else {
            System.out.print("PERDISTE!!! el codigo era ");
            for(char x:check){
                System.out.print(x);
            }
        }
        
    }
}
