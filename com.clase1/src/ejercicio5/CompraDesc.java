package com.ejercicio5;

import java.util.Scanner;

public class CompraDesc {
    public CompraDesc() {
    }

    public static void main(String[] args) {
        int descuento = 30;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        System.out.printf("Ingrese el cantidad del producto : ");
        int cantidad = teclado.nextInt();
        double precioFinal;
        if (precio * (double)cantidad > 400.0) {
            precioFinal = (precio - precio * (double)descuento / 100.0) * (double)cantidad;
            System.out.println("El precio final es: " + precioFinal);
        } else {
            precioFinal = precio * (double)cantidad;
            System.out.println("El precio final es: " + precioFinal);
        }

    }
}