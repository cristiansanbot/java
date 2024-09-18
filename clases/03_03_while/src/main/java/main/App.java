
package main;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        System.out.println("Edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
                
        if (edad==40){
            System.out.println("Tienen exactamente 40");
        } 
        else if (edad <40){
            System.out.println("Eres joven");
        } 
        else{
            System.out.println("Eres viejo");
        }
        
        int variable = 1;
        int variable2 = 11;
        while(variable<5){
            System.out.print(variable+" ");
            variable++;
        }
        
        do{
            System.out.print(variable2+" ");
            variable2++;
        } while(variable2<15);
        
        System.out.println("\n\n-----------------------------------------");
        System.out.println("----------- MENU DE OPCIONES ------------");
        System.out.println("-----------------------------------------\n");
        String opcion;
        double largo, ancho, radio, base, altura, area, perimetro;
        final double PI =3.14;
        final String O1="1";
        final String O2="2";
        final String O3="3";
        final String O0="0";        
        
        
        do{
            
                        System.out.print("""
                         
                             Elige una opcion: 
                         
                         \t1 ó r) Rectangulo
                         \t2 ó c) Circunferencia
                         \t3 ó t) Triangulo
                         \t0 ó s) Salir
                         
                         >>  """);
        
        
        
            opcion = entrada.nextLine();

            
            switch(opcion){
                case O1, "r", "R" -> { 
                    System.out.print("LARGO >> ");
                    largo= entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("ANCHO >> ");
                    ancho= entrada.nextDouble();
                    entrada.nextLine();

                    area=largo*ancho;
                    perimetro= largo*2+ancho*2;

                    System.out.println("Area = "+area+"\nPerimetro = "+perimetro);
                }
                case O2, "c", "C" -> {
                    System.out.print("RADIO >> ");
                    radio= entrada.nextDouble();
                    entrada.nextLine();

                    area= radio*radio*PI;
                    perimetro= radio*2*PI;
                    
                    System.out.println("Area = "+area+"\nPerimetro = "+perimetro);
                }
                case O3, "t", "T" -> {
                    System.out.print("BASE >> ");
                    base = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("ALTURA >> ");
                    altura = entrada.nextDouble();
                    entrada.nextLine();

                    area= (base*altura)/2;
                    
                    System.out.println("Area = "+area);
                }
                case O0, "s", "S" ->{
                    System.out.println("Presione ENTER para salir...");
                    entrada.nextLine();
                }

                default -> {
                    System.out.println("ERROR: No has ingresado una opcion valida");    
                    System.out.println("Presione ENTER para volver al menu...");
                    entrada.nextLine();
                }
            }

        }while(!opcion.equals(O0)&&!opcion.equals("s")&&!opcion.equals("S"));
        
        /*
        if(opcion.equals("1")){
            System.out.print("LARGO >> ");
            largo= entrada.nextDouble();
            entrada.nextLine();
            System.out.print("ANCHO >> ");
            ancho= entrada.nextDouble();
            entrada.nextLine();
            
            area=largo*ancho;
            perimetro= largo*2+ancho*2;
            
            System.out.println("Area = "+area+"\nPerimetro = "+perimetro);
            
        } else if (opcion.equals("2")){
            System.out.print("RADIO >> ");
            radio= entrada.nextDouble();
            entrada.nextLine();
            
            area= radio*radio*PI;
            perimetro= radio*2*PI;
            
            System.out.println("Area = "+area+"\nPerimetro = "+perimetro);
            
        } else if (opcion.equals("3")){
            System.out.print("BASE >> ");
            base = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("ALTURA >> ");
            altura = entrada.nextDouble();
            entrada.nextLine();

            area= (base*altura)/2;

            System.out.println("Area = "+area);
        } else if (opcion.equals("0")){
             System.out.println("Presione ENTER para salir...");
             entrada.nextLine();
        } else {
            System.out.println("ERROR: No has ingresado una opcion valida");
        }
        
        */
        
    
    }
}
