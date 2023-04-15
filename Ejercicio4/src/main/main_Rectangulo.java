/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidad.Rectangulo;

/**
 *
 * @author elias
 */
public class main_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Rectangulo rec1= new Rectangulo();
        
        rec1.crearR(rec1);
        
        rec1.perimetro(rec1);
        
        rec1.superficie();
        
        rec1.mostraR();
        
    }
    
}
