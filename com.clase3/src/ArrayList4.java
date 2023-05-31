public class ArrayList4 {
    public static void main(String[] args) {
        int count = 0;
        String[] words = {"Juuuuuuuuuuuuuuuuan", "John", "Pedro", "Julian"};

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char character = Character.toLowerCase(word.charAt(i));
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    count++;
                }
            }

        }
        System.out.println("La cantidad de vocales es " + count);
    }
}
