package com.ejercicio6;

import java.util.Scanner;

public class ArrayList {
    public ArrayList() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int size = scanner.nextInt();
        int[] valores = new int[size];

        int suma;
        for(suma = 0; suma < size; ++suma) {
            System.out.print("Ingrese la nota " + suma + " ");
            valores[suma] = scanner.nextInt();
        }

        suma = 0;

        for(int i = 0; i < size; ++i) {
            suma += valores[i];
        }

        double promedio = (double)suma / (double)size;
        System.out.println("El valor promedio de las notas ingresadas es: " + promedio);
        if (promedio >= 6.0) {
            System.out.println("Usted esta aprobado");
        } else if (promedio >= 4.0) {
            System.out.println("Usted tiene que ir a recuperatorio");
        } else {
            System.out.println("Usted no esta aprobado");
        }

        scanner.close();
    }
}