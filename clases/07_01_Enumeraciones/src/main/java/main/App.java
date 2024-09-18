package main;

public class App {
    public static enum Dias {DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, SABADO}
    
    public static void main(String[] args) {
        
        Dias d= Dias.DOMINGO;
        System.out.println("name= "+d.name());
        System.out.println("toString= "+d.toString());
        
        Dias d2= Dias.MARTES;
        System.out.println("ordinal= "+d2.ordinal());
        
        
        Dias[] dias= Dias.values();
        for(Dias dia:dias){
            System.out.println(dia);
        }
        
        Dias miDia = Dias.SABADO;
        System.out.println("ANTES DE INVOCAR= "+miDia);
        asignarDia(1,miDia);
        System.out.println("DESPUES DE INVOCAR= "+miDia);
    }
    
    public static void asignarDia(int i, Dias d){
        if(i>=0 && i<Dias.values().length){
            d= Dias.values()[i];
        }else{
            d = Dias.DOMINGO;
        }
    }
    
    
}
