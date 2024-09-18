package main;

import java.util.Random;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        
        
        final short MAX_TARJETAS_GRUPO= 7; //Tarjetas por grupo
        final short MAX_GRUPOS= 3; //Cantidad de grupos
        final short MAX_TARJETAS= MAX_TARJETAS_GRUPO*MAX_GRUPOS; //Total de tarjetas.
        final short MIN_TARJETA_VALOR= 'A'; //Tarjeta incial, en este caso letra A.
        final short MAX_TARJETA_VALOR= (char)(MAX_TARJETAS+(int)('A')-1); //Tarjeta final.
        //Variables que deben usarse para resolver el problema.
        char[] grupo1= new char[MAX_TARJETAS_GRUPO],
         grupo2= new char[MAX_TARJETAS_GRUPO],
         grupo3= new char[MAX_TARJETAS_GRUPO];
        char[] deck= new char[MAX_TARJETAS];

        int rango = ((int)MAX_TARJETA_VALOR - (int)MIN_TARJETA_VALOR)+1;
        int a, verificador;
        char apoyo;
        String usuario;
        Random sorteo = new Random();
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < MAX_TARJETAS; i++) {
            apoyo = (char)(sorteo.nextInt(rango)+(int)MIN_TARJETA_VALOR);
            a=0;
            while(a<i){
                if(deck[a] == apoyo){
                    a=0;
                    apoyo = (char)(sorteo.nextInt(rango)+(int)MIN_TARJETA_VALOR);
                } else {
                    a++;
                }
            }
            
            deck[a] = apoyo;
        }
        
        for (int i = 0, j=0; i < 21; j++, i=i+3) {
            grupo1[j]=deck[i];
        }
        for (int i = 1, j=0; i < 22;j++, i=i+3) {
            grupo2[j]=deck[i];
        }
        for (int i = 2,j=0; i < 23;j++, i=i+3) {
            grupo3[j]=deck[i];
        }
        

        System.out.println("""
                           
                           -----------------------------------------------------------
                           -----------------------------------------------------------
                                               Bienvenid@ aventurer@!                 
                           El dia de hoy tengo para ti un fascinante truco de magia,
                           para ello deberas escoger una carta, la de tu preferencia
                           e indicarme en cual de las 3 pilas esta tu eleccion, para
                           ello haremos 3 secuencias. Empecemos...
                           """);

        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nSecuencia: "+(i+1)+"\n");
            for (int j = 0; j < 7; j++) {
                System.out.println("   "+grupo1[j]+"   "+grupo2[j]+"   "+grupo3[j]);
            }
            verificador = 1;
            
            while(verificador==1){
                
                System.out.print("\nEn que pila esta tu carta? [1,2,3]: ");
                usuario = entrada.nextLine();
                
                if(null == usuario){ 
                    System.out.println("\nCreo que no me entendiste bien, tienes que seleccionar una de las pilas de cartas!");
                }else switch (usuario) {
                    
                    
                    case "1" -> {
                        for (int j = 0; j < 7; j++) {
                            deck[j]=grupo3[j];
                            deck[j+7]=grupo1[j];
                            deck[j+14]=grupo2[j];
                        }
                        verificador=0;
                 
                    }
                    
                    
                    case "2" -> {
                        for (int j = 0; j < 7; j++) {
                            deck[j]=grupo3[j];
                            deck[j+7]=grupo2[j];
                            deck[j+14]=grupo1[j];
                        }
                        verificador=0;                        
                   
                        
                    }
                    
                    
                    case "3" -> {
                        for (int j = 0; j < 7; j++) {
                            deck[j]=grupo2[j];
                            deck[j+7]=grupo3[j];
                            deck[j+14]=grupo1[j];
                        }
                        verificador=0;                        
                  
                        
                    }
                    
                    
                    default -> {
                        System.out.println("\nCreo que no me entendiste bien, tienes que seleccionar una de las pilas de cartas!");
                    }
                }
            }
           
            
        for (int c = 0, j=0; c < 21; j++, c=c+3) {
            grupo1[j]=deck[c];
        }
        for (int c = 1, j=0; c < 22;j++, c=c+3) {
            grupo2[j]=deck[c];
        }
        for (int c = 2,j=0; c < 23;j++, c=c+3) {
            grupo3[j]=deck[c];
        }
        

            verificador = 1;
            
        }
        
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("");
        System.out.println("Obviamente elegiste la "+deck[10]);
        
        
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Espero te hayas divertido tanto como yo! Esta fue solo una\n"
                +          "pequeña muestra de mis habilidades magicas! Espero verte \n"
                +          "pronto por mis tierras, ten una maravillosa aventura!\n"
                +          "HASTA LA PROXIMA!");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }}
