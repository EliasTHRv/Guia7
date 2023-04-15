package entidad;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author elias
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void  cargarLibro(Libro libro) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo del libro");
        this.Titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        this.autor = leer.nextLine();
        System.out.println("Ingrese el número de paginas del libro");
        this.numeroPaginas = leer.nextInt();

    }

}
