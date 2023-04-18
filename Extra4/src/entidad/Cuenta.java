package entidad;

import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 *
 * @author elias
 */
public class Cuenta {

    public int saldo;
    public String titular;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar_dinero() {
        System.out.println("Ingrese el nombre del titular: ");
        titular = leer.next();
        saldo = 30000;
        boolean aux = false;
        int retiro;
        do
        {
            System.out.println("Ingrese el saldo a retirar: ");
            retiro = leer.nextInt();
            
            if (retiro>saldo)
            {
                System.out.println("No posee fondos suficientes:");
                aux = true;
            } else
            {
                saldo -= retiro;
            }
            
            System.out.println("Su saldo es de: " + saldo);

        } while (aux != true);

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
