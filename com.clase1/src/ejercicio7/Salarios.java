package com.ejercicio7;

import java.util.Scanner;

public class Salarios {
    public Salarios() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingrese las horas trabajadas: ");
        int horasTrabajadas = teclado.nextInt();
        int salarioSemanal;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = horasExtras * 30 + 800;
            System.out.println("El salario semanal es: " + salarioSemanal);
        } else {
            salarioSemanal = horasTrabajadas * 20;
            System.out.println("El salario semanal es: " + salarioSemanal);
        }

        teclado.close();
    }
}

