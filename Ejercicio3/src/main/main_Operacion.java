/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import entidad.Operacion;

/**
 *
 * @author elias
 */
public class main_Operacion {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();

        op1.crearOperacion(op1);

//        op1.sumar();
        System.out.println(op1.sumar());
//        op1.restar();
        System.out.println(op1.restar());
//        op1.multiplicar();
        System.out.println(op1.multiplicar());
//        op1.dividir();
        System.out.println(op1.dividir());
    }
}
