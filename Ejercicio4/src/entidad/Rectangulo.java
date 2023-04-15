/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void crearR(Rectangulo Rectangulo) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo:");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo:");
        this.altura = leer.nextInt();

    }

    public void perimetro(Rectangulo Rectangulo) {

        int aux = ((base + altura) * 2);
        System.out.println("El perimetro del rectangulo es: "+aux);
    }

    public void superficie() {
//        base * altura  Perímetro
   int aux2 = ((base * altura) *2);
        System.out.println("La superficie del rectangulo es: "+aux2);
    }

    public void mostraR(){
     for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1 || j == 0 || j == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
        
    
    
    
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
