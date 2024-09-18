package main;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        char [][] tablaLetras=new char[5][3];
        Random sorteo = new Random();
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <3; j++) {
                tablaLetras[i][j]= (char)(sorteo.nextInt(26)+65);

            }
        }
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(tablaLetras[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
