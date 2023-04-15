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
public class Persona {
    public String nombre;
    public int fechaN;
    public String naC;

    public Persona() {
    }

    public Persona(String nombre, int fechaN, String naC) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.naC = naC;
    }

    
    

//    public Persona(String nombre, int fechaN, String naC) {
//        this.nombre = nombre;
//        this.fechaN = fechaN;
//        this.naC = naC;
//    }

    public void rellenarP(Persona Persona){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la fecha");
        this.fechaN= leer.nextInt();
        System.out.println("Ingrese un nombre");
        this.nombre= leer.next();
        System.out.println("Ingrese la nacionalidad:");
        this.naC=leer.next();
        
    }
    
    public void mostrarP(Persona Persona){
      
        System.out.println(this.fechaN);
     
        System.out.println(this.nombre);
    
        System.out.println(this.naC);
      
        
    }
    
    
    
    
    
//    
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public int getFechaN() {
//        return fechaN;
//    }
//
//    public void setFechaN(int fechaN) {
//        this.fechaN = fechaN;
//    }
//
//    public String getNaC() {
//        return naC;
//    }
//
//    public void setNaC(String naC) {
//        this.naC = naC;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaN() {
        return fechaN;
    }

    public void setFechaN(int fechaN) {
        this.fechaN = fechaN;
    }

    public String getNaC() {
        return naC;
    }

    public void setNaC(String naC) {
        this.naC = naC;
    }
    
    
    
}
