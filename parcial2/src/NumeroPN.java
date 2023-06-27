import java.util.Scanner;

public class NumeroPN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if(numero > 0) System.out.println("Este numero es positivo");
        else if(numero < 0) System.out.println("Este numero es negativo");
        else System.out.println("Este numero es cero");


        scanner.close();

    }
}
