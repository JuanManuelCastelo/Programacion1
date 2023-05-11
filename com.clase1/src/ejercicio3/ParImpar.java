
package com.ejercicio3;

import java.util.Scanner;

public class ParImpar {
    public ParImpar() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}