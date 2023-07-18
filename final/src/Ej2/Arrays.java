package Ej2;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int size = scanner.nextInt();

        int[] numeros = new int[size];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los números es: " + suma);
    }
}
