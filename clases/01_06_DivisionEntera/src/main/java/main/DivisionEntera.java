package main;

import java.util.Scanner;

public class DivisionEntera {
    
    public static void main(String[] args){
        
        System.out.println("-----------------------------------------");
        System.out.println("----------- PELOTAS POR NIÑO ------------");
        System.out.println("-----------------------------------------");
        
        Scanner entrada= new Scanner (System.in);
        int cantPelotas, cantNiños;
        int pelotasPorNiño, pelotasSobrantes;
        
        System.out.println("Ingresa la cantidad de niños, y luego la cantidad de pelotas: ");
        cantNiños = entrada.nextInt();
        cantPelotas = entrada.nextInt();
        entrada.nextLine();
        
        pelotasPorNiño= cantPelotas/cantNiños;
        pelotasSobrantes= cantPelotas%cantNiños;
        
        System.out.println("Pelotas por niño= "+pelotasPorNiño+", pelotas sobrantes= "+pelotasSobrantes);
        
        
        System.out.println("-----------------------------------------");
        System.out.println("---- SUMAR CIFRAS, NUMERO 4 DIGITOS -----");
        System.out.println("-----------------------------------------");        
        
        int numeroCuatroCifras;
        int c1, c2, c3, c4;
        int suma;
        //4578
        
        System.out.println("Ingresa un numero de cuatro cifras= ");
        numeroCuatroCifras= entrada.nextInt();
        entrada.nextLine();
        
        
        c1 = numeroCuatroCifras%10;
        c2 = (numeroCuatroCifras/10)%10;
        c3 = (numeroCuatroCifras/100)%10;
        c4 = numeroCuatroCifras/1000;
        
        suma=c1+c2+c3+c4;
        System.out.println("Suma de cifras= "+suma);
        
        
        
        System.out.println("-----------------------------------------");
        System.out.println("---- SUMAR CIFRAS, NUMERO 6 DIGITOS -----");
        System.out.println("-----------------------------------------");        
        
        int numeroSeisCifras;
        int c1a, c2a, c3a, c4a, c5a, c6a;
        int suma2;
        //4578
        
        System.out.println("Ingresa un numero de seis cifras= ");
        numeroSeisCifras= entrada.nextInt();
        entrada.nextLine();
        
        
        c1a = numeroSeisCifras%10;
        c2a = (numeroSeisCifras/10)%10;
        c3a = (numeroSeisCifras/100)%10;
        c4a = (numeroSeisCifras/1000)%10;
        c5a = (numeroSeisCifras/10000)%10;        
        c6a = numeroSeisCifras/100000;        
        suma=c1a+c2a+c3a+c4a+c5a+c6a;
        System.out.println("Suma de cifras= "+suma);        
    }
}
