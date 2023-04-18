package entidad;

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

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

public void     
    
    
    
    
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
