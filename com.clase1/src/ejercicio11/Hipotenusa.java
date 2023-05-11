package com.ejercicio11;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Hipotenusa {
    public Hipotenusa() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        double base = 0.0;
        double altura = 0.0;
        boolean Isvalid = false;

        while(!Isvalid) {
            System.out.printf("Ingrese el valor de la base: ");

            try {
                base = input.nextDouble();
                Isvalid = true;
            } catch (InputMismatchException var10) {
                System.out.printf("Input invalido. Por favor ingresa un valor numerico.");
                input.next();
            }
        }

        Isvalid = false;

        while(!Isvalid) {
            System.out.printf("Ingrese el valor de la altura: ");

            try {
                altura = input.nextDouble();
                Isvalid = true;
            } catch (InputMismatchException var9) {
                System.out.printf("Input invalido. Por favor ingresa un valor numerico.");
                input.next();
            }
        }

        double hipotenusa = Math.sqrt(base * base + altura * altura);
        System.out.println("La hipotenusa es: " + hipotenusa);
        input.close();
    }
}
