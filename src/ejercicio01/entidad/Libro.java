package ejercicio01.entidad;

import java.util.Scanner;

public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public Libro(int ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public Libro() {
    }

    public Libro crearLibro() {
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingresa el ISBN:");
        libro.setISBN(sc.nextInt());
        System.out.println("Ingresa el Título:");
        libro.setTitulo(sc.next());
        System.out.println("Ingresa el Autor:");
        libro.setAutor(sc.next());
        System.out.println("Ingresa la cantidad de páginas:");
        libro.setNumPaginas(sc.nextInt());
        return libro;
    }

    public void mostrarLibro(Libro libro) {
        System.out.println("ISBN : " + libro.getISBN());
        System.out.println("Título : " + libro.getTitulo());
        System.out.println("Autor : " + libro.getAutor());
        System.out.println("Páginas : " + libro.getNumPaginas());
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }
}
