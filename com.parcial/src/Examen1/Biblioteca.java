package Examen1;

public class Biblioteca {
    public int idLibro;
    public String titulo;
    public String genero;
    public String autor;
    public int anio;

    public void mostrarAutor() {

        System.out.println("\nEl id del libro es " + idLibro);
        System.out.println("\nEl titulo del libro es " + titulo);
        System.out.println("\nEl autor del libro es " + autor);
        System.out.println("\nEl año del libro es " + anio);

    }

    public void mostrarLibroGenero() {

        System.out.println("\nEl id del libro es " + idLibro);
        System.out.println("\nEl titulo del libro es " + titulo);
        System.out.println("\nEl genero del libro es " + genero);
        System.out.println("\nEl año del libro es " + anio);

    }
}
