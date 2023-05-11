package com.ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    public QuadraticEquation() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean Isvalid = false;

        while(!Isvalid) {
            System.out.print("Ingresa el valor de a: ");

            try {
                a = input.nextDouble();
                Isvalid = true;
            } catch (InputMismatchException var21) {
                System.out.println("Input invalido. Por favor ingresa un valor numerico.");
                input.next();
            }
        }

        Isvalid = false;

        while(!Isvalid) {
            System.out.print("Ingresa el valor de b: ");

            try {
                b = input.nextDouble();
                Isvalid = true;
            } catch (InputMismatchException var20) {
                System.out.println("Input invalido. Por favor ingresa un valor numerico.");
                input.next();
            }
        }

        Isvalid = false;

        while(!Isvalid) {
            System.out.print("Ingresa el valor de c: ");

            try {
                c = input.nextDouble();
                Isvalid = true;
            } catch (InputMismatchException var19) {
                System.out.println("Input invalido. Por favor ingresa un valor numerico.");
                input.next();
            }
        }

        double discriminante = b * b - 4.0 * a * c;
        double raiz11 = (-b + Math.sqrt(discriminante)) / (2.0 * a);
        double raiz21 = (-b - Math.sqrt(discriminante)) / (2.0 * a);
        if (discriminante > 0.0) {
            System.out.println("Las raices son " + raiz11 + " y " + raiz21);
        } else if (discriminante == 0.0) {
            double raiz1 = -b / (2.0 * a);
            System.out.println("La raiz es " + raiz1);
        } else {
            System.out.println("La ecuacion no tiene raices reales. Estan son " + raiz11 + " y " + raiz21);
        }

        input.close();
    }
}
