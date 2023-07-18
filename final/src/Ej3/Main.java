package Ej3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de cuentas a ingresar: ");
        int cantidadCuentas = scanner.nextInt();

        ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();

        for(int i = 0; i < cantidadCuentas; i++) {

            System.out.print("Ingrese el número de cuenta: ");
            int numeroCuenta = scanner.nextInt();

            System.out.print("Ingrese el saldo de la cuenta: ");
            double saldo = scanner.nextDouble();

            CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo);

            cuentas.add(cuenta);
        }

        CuentaBancaria cuentaMasAlta = new CuentaBancaria(0,0);

        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.saldo > cuentaMasAlta.saldo) {
                cuentaMasAlta = cuenta;
            }
        }


        System.out.println("La cuenta con el saldo más alto es: ");
        System.out.println("Número de cuenta: " + cuentaMasAlta.numeroCuenta);
        System.out.println("Saldo: " + cuentaMasAlta.saldo);

    }
}
