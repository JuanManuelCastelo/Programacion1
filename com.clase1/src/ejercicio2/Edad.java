package com.ejercicio2;

import java.util.Scanner;

public class Edad {
    public Edad() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}