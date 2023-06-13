package EjEmpleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();

        // Crear array de objetos Empleado
        Empleado[] empleados = new Empleado[cantidadEmpleados];

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.next();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();

            System.out.print("Antigüedad: ");
            int antiguedad = scanner.nextInt();

            empleados[i] = new Empleado(nombre, salario, antiguedad);
        }

        double porcentajeAumento = 0.1; // 10% de aumento

        // Aplicar aumento del 10% a empleados con antigüedad superior a 5 años
        for (Empleado empleado : empleados) {
            if (empleado.getAntiguedad() > 5) {
                empleado.aplicarAumento(porcentajeAumento);
            }
        }

        // Mostrar nombre y salario actualizado de cada empleado
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.getSalario());
        }

        scanner.close();
    }
}
