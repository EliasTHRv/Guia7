package entidad;

import java.util.Scanner;

/**
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
 * área del rectángulo.
 *
 * @author elias
 */
public class Rectangulo {
public double lado1, lado2;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo() {
        
        System.out.println("   ");
    }

    
   
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void rellenarC(){
    System.out.println("Ingrese el lado 1 del rectangulo: ");
        lado1 = leer.nextInt();
        System.out.println("Ingrese el lado 2 del rectangulo: ");
        lado2 = leer.nextInt();
        
    }
    
    public double calcular_area(){
        
        double aux = lado1 * lado2;
        return aux;
    }
    
    
    
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    


}
