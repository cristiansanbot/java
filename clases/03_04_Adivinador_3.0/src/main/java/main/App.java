
package main;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); // Lectura de entrada
    
        String opcion;
        boolean adivino, trampa;
        int min, max, i, maxIntentos, numeroPosible;
        
        System.out.println("Intenrae adivinar un numero que tu elijas.");
        System.out.println("Cuando indique un numero tu deberas ingresar:");
        System.out.println("\t= si acierto al numero que tu quieres que adivine.");
        System.out.println("\t> si el numero que tu quieres que adivine es mayor que el que mostre.");
        System.out.println("\t< si el numero que tu quieres que adivine es menor que el que mostre.");
        System.out.print("Dime el numero minimo: ");
        min = entrada.nextInt(); entrada.nextLine();
        System.out.println("Dime el numero maximo");
        max = entrada.nextInt(); entrada.nextLine();
        System.out.println();
       
        maxIntentos = (int) (Math.log(max-min+1)/Math.log(2)+1);
        
        System.out.println("EXCELENTE. adivinare tu numero en no mas de "+maxIntentos+" intentos.");
        System.out.println("Presiona ENTER cuando quieras comenzar...");
        entrada.nextLine();
        System.out.println();
        
        adivino= false;
        trampa=false;
        
        for(i=1;i<maxIntentos;i++){
            numeroPosible = ((max-min)/2)+min;
            System.out.println("Intento "+i+" -> El numero es..."+numeroPosible+": ");
            opcion= entrada.nextLine();
            
            switch(opcion){
                case "=":
                    adivino = true;
                    break;
                case "<":
                    max=numeroPosible-1;
                    break;
                case ">":
                    min=numeroPosible+1;
                    break;
            }
            
            if(adivino) break;
            
            if((min>max) || (max<min)){
                System.out.println("¡¡¡¡ESTAS HACIENDO TRAMPA!!!!");
                trampa=true;
                break;
            }
        }
        
        if ((i==maxIntentos) && (!adivino) && (!trampa)){
            System.out.println("¡¡¡GANASTE!!! No pude encontrar el numero.");
        } else if (adivino){
            System.out.println("¡¡¡GANE!!! ponmelo mas dificil");
        }
        
    }
}
