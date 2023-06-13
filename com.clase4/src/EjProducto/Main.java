package EjProducto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de objetos Producto
        Producto[] productos = new Producto[3];

        // Obtener los datos de cada producto
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese los datos del Producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer un número

            // Crear objeto Producto y asignarlo al array
            productos[i] = new Producto(nombre, precio, cantidad);
        }

        // Mostrar el nombre y el valor total de cada producto
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Valor total: " + producto.getValorTotal());
            System.out.println("----------------------");
        }

        scanner.close();
    }
}