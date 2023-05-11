package com.ejercicio9;

import java.util.Scanner;

public class CompareStrings {
    public CompareStrings() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese la primera palabra: ");
        String s1 = sc.nextLine();
        System.out.printf("Ingrese la segunda palabra: ");
        String s2 = sc.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Las palabras son iguales");
        } else if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Las palabras son iguales pero no su case");
        } else {
            System.out.println("Las palabras no son iguales");
        }

    }
}

