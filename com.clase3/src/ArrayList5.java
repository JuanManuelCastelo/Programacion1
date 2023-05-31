import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {

        int suma = 0;
        double promedio = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int size = scanner.nextInt();
        int[] valores = new int[size];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            suma += valores[i];
        }

        promedio = (double) suma / valores.length;
        System.out.println("El promedio de los alumnos: " + promedio);
    }
}
