import java.util.ArrayList;
import java.util.Scanner;

public class WhileIter {

    public static void main(String[] args) {
        int suma = 0;

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que quiere: ");
        int cantidad = scanner.nextInt();

        int i = 1;
        while (i <= cantidad) {
            System.out.print("Ingrese un número entero no negativo: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            i++;
        }

        int j = 0;
        while (j < cantidad) {
            int num = numeros.get(j);
            if (num == 0) {
                System.out.println("Se finaliza la suma porque se ingresó un 0");
                break;

            } else {
                suma += num;
            }
            j++;
        }

        System.out.println("La suma de los números es: " + suma);
    }
}

