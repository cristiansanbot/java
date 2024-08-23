package calculos_simples;

import java.util.Scanner;


public class CalculosSimples {

    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("--- AREA Y PERIMETRO DE UN RECTANGULO ---");
        System.out.println("-----------------------------------------");
        
        
        
        int largo, ancho;
        int area, perimetro;
        
        System.out.print("Ingresa el largo del rectangulo: ");
        largo = consola.nextInt();
        consola.nextLine();
        
        System.out.print("Ingresa el ancho del rectangulo: ");
        ancho = consola.nextInt();
        consola.nextLine();
    
        perimetro = largo*2+ancho*2;
        area = largo*ancho;
        
        System.out.println("El perimetro del rectangulo ingresado es: " +perimetro);
        System.out.println("El area del rectangulo ingresado es: " +area);
        
        
        System.out.println("-----------------------------------------");
        System.out.println("--------- AREA DE UN TRIANGULO ----------");
        System.out.println("-----------------------------------------");
        
        double base, altura;
        double area2;
        
        System.out.print("Ingresa la base del triangulo: ");
        base = consola.nextDouble();
        consola.nextLine();
        
        System.out.print("Ingresa la altura del triangulo: ");
        altura = consola.nextDouble();
        consola.nextLine();
    
        area2= (base*altura)/2;
        
        System.out.println("Area = "+area2);
        

        System.out.println("-----------------------------------------");
        System.out.println("--------- PROMEDIO DE 5 NUMEROS ---------");
        System.out.println("-----------------------------------------");
        
        

        double v1, v2, v3, v4, v5, r;
        
        System.out.print("Ingresa el numero 1: ");
        v1 = consola.nextDouble();
        consola.nextLine();
    
        System.out.print("Ingresa el numero 2: ");
        v2 = consola.nextDouble();
        consola.nextLine();
    
        System.out.print("Ingresa el numero 3: ");
        v3 = consola.nextDouble();
        consola.nextLine();
    
        System.out.print("Ingresa el numero 4: ");
        v4 = consola.nextDouble();
        consola.nextLine();
    
        System.out.print("Ingresa el numero 5: ");
        v5 = consola.nextDouble();
        consola.nextLine();
    
        r = (v1+v2+v3+v4+v5)/5;
        
        System.out.println("el promedio de los 5 numeros es: "+r);
        
        
        System.out.println("-----------------------------------------");
        System.out.println("--- AREA Y PERIMETRO DE UN CIRCULO ---");
        System.out.println("-----------------------------------------");        
        
        final double pi= 3.141592;
        final String palabra = "Hola";
        
        double radio;
        double perimetro3, area3;
        
        System.out.println("Ingresa el radio: ");
        radio = consola.nextDouble();
        consola.nextLine();
        
        perimetro3 = (radio*2)*pi;
        area3 = radio*radio*pi;
        
        System.out.println("P= "+perimetro3+", A= "+area3);
        
    }
}
