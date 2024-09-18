package main;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Lectura de entrada
        Random numeros = new Random(); // generador de numeros aleatorios
    
        // Genero numero entre 1 y 100
        int numeroSecreto = numeros.nextInt(100)+1;
        int valorLeido;
        boolean adivino=false;
        
        
        
        for(int intento=1; intento <= 10; intento++){
            System.out.print("\nIntento "+intento+"\n>> ");
            valorLeido= entrada.nextInt();
            entrada.nextLine();
            
            if(valorLeido<numeroSecreto){
                System.out.println("Mas arriba!");
            }
            if(valorLeido>numeroSecreto){
                System.out.println("Mas abajo!");
            }
            
            if(valorLeido==numeroSecreto){
                System.out.println("Adviniste!");
                adivino=true;
                break;
            }
        }
        
        if(!adivino){
            System.out.println("No adiviniste. El numero era "+numeroSecreto);
        }
        
    }
}
