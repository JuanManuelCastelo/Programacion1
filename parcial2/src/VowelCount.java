import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                count = count + 1;
            }

        }
        System.out.println("La palabra tiene " + count + " vocales");
    }
}
