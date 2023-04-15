/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class main_Persona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona per2 = new Persona("Belen", 1985, "Argentina");

        Persona per4 = new Persona("Laura", 1998, "chile");

        System.out.println(per4.getNombre ()+" " +per4.getNaC());
        System.out.println(per4.getFechaN());
        System.out.println(per4.getNaC());

        System.out.println("-------");
        
        per2.setNombre("Roberto");
        
        
        System.out.println(per2.getNombre());
        System.out.println(per2.fechaN);
        System.out.println(per2.naC);

        Persona per1 = new Persona();
        Persona per3 = new Persona();

        System.out.println("--------");

     per1.rellenarP(per3);

        System.out.println("------");

        per1.mostrarP(per1);

        System.out.println("------");
        per3.rellenarP(per3);
        System.out.println("------");
        per3.mostrarP(per3);

    }
}
