package main;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var generadorAleatorio = new Random();
        int[] numeros = new int[10], posiciones= new int [10];
        int tope = 0, numeroBuscado;
        
        
        // Generar numeros al azar en numeros
        for (int i = 0; i < 10; i++) {
            numeros[i]= generadorAleatorio.nextInt(10)+1;
        }
        
        System.out.print("Numero buscado >> ");
        numeroBuscado = consola.nextInt(); consola.nextLine();
        
        for (int i = 0; i < 10; i++) {
            if(numeros[i]==numeroBuscado){
                tope++;
                posiciones[tope]= i;
            }
        }
        
        System.out.println("Arreglo original: ");
        for (int x: numeros){
            System.out.print(" "+ x);
        }
        System.out.println("\nNumero buscado: "+numeroBuscado);
        System.out.print("Posciones: ");
        for (int i = 0; i <= tope; i++) {
            if(posiciones[i]!=0){
                System.out.print(" "+(posiciones[i]+1));
            }
        }
    }
}
