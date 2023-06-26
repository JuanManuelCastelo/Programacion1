//Crea una clase llamada NumeroPN0 que valide si el numero ingresado es 0, negativo o positivo.

import java.util.Scanner;

public class NumeroPN0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        if (numero == 0) {
            System.out.println("El numero es 0");
        } else if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}

