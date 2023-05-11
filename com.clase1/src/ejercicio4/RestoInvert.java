package com.ejercicio4;

import java.util.Scanner;

public class RestoInvert {
    public RestoInvert() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();
        System.out.print("Ingrese otro numero: ");
        int numero2 = teclado.nextInt();
        if (numero % numero2 == 0) {
            System.out.printf("\n\n%d es divisible por %d ", numero, numero2);
        } else {
            System.out.printf("\n\n%d no es divisible por %d ", numero, numero2);
        }

    }
}
