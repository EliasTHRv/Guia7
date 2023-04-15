package entidad;

import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: Método
 * constructor con todos los atributos pasados por parámetro. Método constructor
 * sin los atributos pasados por parámetro. Métodos get y set. Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. Método restar(): calcular la resta de los
 * números y devolver el resultado al main Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main Método dividir(): primero
 * valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 * @author elias
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void crearOperacion(Operacion Operacion) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero 1");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        this.numero2 = leer.nextInt();

    }

    public int sumar() {
        int aux = 0;

        aux = (numero1 + numero2);

        return aux;
    }

    public int restar() {
        int aux1;
        aux1 = (numero1 - numero2);
        return aux1;
    }

    public int multiplicar() {
        int aux3 =0;
        if (numero1 != 0 && numero2 != 0)
        {
            aux3 = numero1 * numero2;

        } else
        {
            System.out.println("Error multiplicacion por 0");
        }

        return aux3;
    }
    
    public double dividir(){
    double aux4=0;
        if (numero1 != 0 && numero2 != 0)
        {
            aux4 = numero1 * numero2;

        } else
        {
            System.out.println("Error division por 0");
        }
        return aux4;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

}
