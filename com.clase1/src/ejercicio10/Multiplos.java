package com.ejercicio10;

import java.util.Scanner;

public class Multiplos {
    public Multiplos() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingrese el divisor: ");
        int numero = teclado.nextInt();
        System.out.printf("Ingrese el dividendo: ");
        int numero2 = teclado.nextInt();
        if (numero % numero2 > 0) {
            System.out.println("El numero " + numero + " no es multiplo de " + numero2);
        } else {
            System.out.println("El numero " + numero + " es multiplo de " + numero2);
        }

    }
}
