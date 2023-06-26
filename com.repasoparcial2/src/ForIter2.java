import java.util.ArrayList;
import java.util.Scanner;

public class ForIter2 {

    public static void main(String[] args) {

            int suma = 0;

            ArrayList<Integer> numeros = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de numeros que quiere: ");

            int cantidad = scanner.nextInt();

            for (int i = 1; i <= cantidad; i++) {

                System.out.print("Ingrese un numero entero no negativo: ");
                int numero = scanner.nextInt();
                numeros.add(numero);


            }

            for (int i = 1 ; i <= cantidad; i++) {

                if (numeros.get(i - 1) > 0) {

                    suma += numeros.get(i - 1);

                } else {
                    System.out.println("Se finaliza la suma porque se ingreso un 0");
                    break;
                }


            }

            System.out.println("La suma de los numeros es: " + suma);

        }
    }

