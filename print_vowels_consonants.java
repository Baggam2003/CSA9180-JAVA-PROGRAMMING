import java.util.Scanner;

public class print_vowels_consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String consonants = getConsonants(word);
        String vowels = getVowels(word);

        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }

    public static String getConsonants(String word) {
        StringBuilder consonants = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (isConsonant(ch)) {
                consonants.append(ch);
            }
        }

        return consonants.toString();
    }

    public static String getVowels(String word) {
        StringBuilder vowels = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (isVowel(ch)) {
                vowels.append(ch);
            }
        }
        return vowels.toString();
    }

    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
