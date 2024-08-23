package main;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Lectura de entrada
        Random numeros = new Random(); // generador de numeros aleatorios
    
        // Genero numero entre 1 y 100
        int valorLeido, num1, num2;
        int max=0;
        int min=0;
        boolean adivino=false;
        num1 = numeros.nextInt(1001)+1;
        num2 = numeros.nextInt(101)+1;
        
        if(num1<num2){
            max=num2;
            min=num1;
        } else if(num1>num2){
            max=num1;
            min=num2;
        } else if(num1==num2){
            num2 = numeros.nextInt(101)+1;
            if(num1<num2){
                max=num2;
                min=num1;
            } else if(num1>num2){
                max=num1;
                min=num2;
            }  
        }
        int numeroSecreto = numeros.nextInt(num2)+1+num1;        
        
        System.out.println("Adivinador 2.0 - Dispones de 10 intentos para adivinar.");
        System.out.println("Rango de valores: "+min+" a "+(max+min)+" inclusive.");
        System.out.println("numero: "+numeroSecreto);
        
        for(int intento=1; intento <= 10; intento++){
            System.out.print("\nIntento "+intento+"\n>> ");
            valorLeido= entrada.nextInt();
            entrada.nextLine();
            
            if(valorLeido<numeroSecreto){
                System.out.println("El numero a adivinar es mayor.");
            }
            if(valorLeido>numeroSecreto){
                System.out.println("El numero a adivinar es menor.");
            }
            
            if(valorLeido==numeroSecreto){
                System.out.println("\n\n¡¡¡GANASTE!!!\n\n");
                adivino=true;
                break;
            }
        }
        
        if(!adivino){
            System.out.println("\n\n¡¡¡PERDISTE!!! el numero era: "+numeroSecreto+"\n\n");
        }
    }
}
