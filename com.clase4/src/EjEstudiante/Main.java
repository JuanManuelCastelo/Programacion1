package EjEstudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Crear array de objetos Estudiante con el tamaño ingresado
        Estudiante[] estudiantes = new Estudiante[numeroEstudiantes];

        // Agregar datos de los estudiantes utilizando el Scanner
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            System.out.print("Ingrese la cantidad de calificaciones del estudiante " + (i + 1) + ": ");
            int cantidadCalificaciones = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            double[] calificaciones = new double[cantidadCalificaciones];
            for (int j = 0; j < cantidadCalificaciones; j++) {
                System.out.println("Ingrese la calificación " + (j + 1) + " del estudiante " + (i + 1) + ": ");
                calificaciones[j] = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer del scanner
            }

            estudiantes[i] = new Estudiante(nombre, edad, calificaciones);
        }

        // Calcular y mostrar el promedio de calificaciones de cada estudiante
        for (Estudiante estudiante : estudiantes) {
            double[] calificaciones = estudiante.getCalificaciones();
            double suma = 0;

            for (double calificacion : calificaciones) {
                suma += calificacion;
            }

            double promedio = suma / calificaciones.length;
            System.out.println("Promedio de calificaciones de " + estudiante.getNombre() + ": " + promedio);
        }

        // Cerrar el Scanner al finalizar
        scanner.close();
    }
}
