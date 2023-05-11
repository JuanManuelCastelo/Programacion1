package Examen1;

public class TestLibro {
    public static void main(final String[] args) {

        Biblioteca libro1 = new Biblioteca(); //Primero libro
        libro1.idLibro = 1;
        libro1.titulo = "La bella y la bestia";
        libro1.genero = "Fantasia";
        libro1.autor = "Disney";
        libro1.anio = 1955;

        libro1.mostrarAutor();        //Metodos de muestra libro1
        libro1.mostrarLibroGenero();

        Biblioteca libro2 = new Biblioteca(); //Segundo libro
        libro2.idLibro = 2;
        libro2.titulo = "Harry Potter";
        libro2.genero = "Fantasia";
        libro2.autor = "J.K. Rowling";
        libro2.anio = 2015;

        libro2.mostrarAutor();       //Metodos de muestra libro2
        libro2.mostrarLibroGenero();

        Biblioteca libro3 = new Biblioteca(); //Tercer libro
        libro3.idLibro = 3;
        libro3.titulo = "Percy Jakson";
        libro3.genero = "Fantasia";
        libro3.autor = "Dreamworks";
        libro3.anio = 2017;

        libro3.mostrarAutor();       //Metodo de muestra libro3
        libro3.mostrarLibroGenero();

        final Biblioteca libro4 = new Biblioteca(); //Cuarto libro
        libro4.idLibro = 4;
        libro4.titulo = "Sherlock Holmes";
        libro4.genero = "Misterio policial";
        libro4.autor = "Arthur Conan Doyle";
        libro4.anio = 2013;

        libro4.mostrarAutor();    //Metodo de muestra libro4
        libro4.mostrarLibroGenero();

        Biblioteca libro5 = new Biblioteca();  //Quinto libro
        libro4.idLibro = 5;
        libro4.titulo = "Don Quijote de la Mancha";
        libro4.genero = "Accion";
        libro4.autor = "Miguel de Cervantes";
        libro4.anio = 1605 ;

        libro4.mostrarAutor();   //Metodo de muestra libro5
        libro4.mostrarLibroGenero();
    }




}
