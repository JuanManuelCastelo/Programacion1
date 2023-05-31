public class ArrayList2 {
    public static void main(String[] args) {
        String[] words = {"Juannnnnn", "John", "Pedioioioiro", "Julian"};
        String longestWord = "";

        for(int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("La palabra más larga es: " + longestWord);
    }
}

