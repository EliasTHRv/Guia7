package Entidad;

import java.util.Scanner;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro. Métodos get
 * y set para el atributo radio de la clase Circunferencia. Método para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. Método area(): para calcular el área de la circunferencia
 * (Area=〖π*radio〗^2). Método perimetro(): para calcular el perímetro
 * (Perimetro=2*π*radio).
 *
 * @author elias
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCincunferencia(Circunferencia Circunferencia) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio = leer.nextDouble();
        
    }
     public void aRea(Circunferencia Circunferencia){
         System.out.println("Calcula el area");
         double r1 = Circunferencia.getRadio();
         double aR = (3.14*(r1*r1));
         
         System.out.println(aR);
     }
public void periMetro(Circunferencia circunferencia){
       System.out.println("Calcula el perimetro");
    double r2 = circunferencia.getRadio();
    double pR=((2*3.14*r2));
    System.out.println(pR);
}
     
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
}
