package entidad;

import java.util.Scanner;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento
 * salarial de un empleado en función de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si
 * tiene menos de 30 años.
 *
 * @author elias
 */
public class Empleado {
public String nombre;
public int edad, salario;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

public void calcular_aumento(){
    System.out.println("Ingrese el nombre del empleado: ");
    nombre = leer.next();
    System.out.println("Ingrese la edad del empleado: ");
    edad = leer.nextInt();
    System.out.println("Ingrese el salario actual del empleado: ");
    salario = leer.nextInt();
    
    
    
    if (edad >30)
    {
        System.out.println("Le corresponde el 10% de aumento: " + salario*1.10);
    } else
        System.out.println("Le corresponde el 5% de aumento: "+ salario*1.05);
    {
    }
    
    
}    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    

}