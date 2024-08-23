package main;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int numero, numero2;
        char letra, letra2;
        Random sorteo = new Random();
        
        for (int i = 0; i < 100; i++) {
            numero = sorteo.nextInt(90-65+1)+65;
            letra= (char)numero;
            System.out.print(letra+" ");
        }
        System.out.println("");
        for (int i = 0; i < 100; i++) {
            numero2 = sorteo.nextInt(122-97+1)+97;
            letra2= (char)numero2;
            System.out.print(letra2+" ");
        }
    }
}
