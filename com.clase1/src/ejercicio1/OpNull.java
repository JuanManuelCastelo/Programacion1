package com.ejercicio1;

import java.util.Scanner;

public class OpNull {
    public OpNull() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese su nombre: ");
        String name = scanner.nextLine();
        promptUser(name);
    }

    private static void promptUser(String name) {
        if (name != null && !name.trim().isEmpty()) {
            System.out.println("Hola " + name);
        } else {
            System.out.println("El nombre ingresado no entro");
        }

    }
}

