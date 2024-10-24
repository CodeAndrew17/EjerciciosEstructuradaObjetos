import com.biblioteca.mantener.*;
import java.util.Scanner;

public class AppBiblioteca {
    Libro libro;

    public static void main(String[] args) throws Exception {
        AppBiblioteca appBiblioteca = new AppBiblioteca();
        appBiblioteca.cargar();
        appBiblioteca.imprimir();
    }

    public void cargar() {
        libro = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el código del libro:");
        libro.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del libro:");
        libro.setNombre(sc.nextLine());
        System.out.println("Ingrese el número de la edición:");
        libro.setEdicion(sc.nextInt());
        System.out.println("Ingrese el año de publicación:");
        libro.setAñoPublicacion(sc.nextInt());

        Autor  autor = new Autor();
        System.out.println("Ingrese el codigo del autor");
        autor.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del autor");
        autor.setNombre(sc.nextLine());
        sc.nextLine();

        libro.setAutor(autor);
    }
    public void imprimir(){
        System.out.println(libro);

    }
}