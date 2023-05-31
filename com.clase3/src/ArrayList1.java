import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        String[] words = {"Juan", "John", "Pedro", "Julian"};
        char caracter = 'J';
        int count = 0;

        for (String word : words) {
            if (word.startsWith(String.valueOf(caracter))) {
                count++;
            }
        }

        System.out.println("La letra " + caracter + " aparece " + count + " veces");
    }

}
