package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos");
        int cantidad = scanner.nextInt();


        Producto[] productos = new Producto[cantidad];


        for(int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese el nombre del producto");
            String nombre = scanner.next();

            System.out.println("Ingrese el precio del producto");
            int precio = scanner.nextInt();

            Producto producto = new Producto(nombre, precio);

            productos[i] = producto;

        }

        for (Producto producto1 : productos) {
            System.out.println("El nombre del producto es " + producto1.getNombre() + " y su precio es " + producto1.getPrecio());
        }
    }

}
