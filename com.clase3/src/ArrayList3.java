public class ArrayList3 {
    public static void main(String[] args) {
        String word = "";
        String[] words = {"Juan", "John", "Pedro", "Julian"};

        for(String word1 : words) {
            word = word.concat(" ").concat(word1);
        }

        System.out.println(word);
    }
}
