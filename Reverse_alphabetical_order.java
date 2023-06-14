import java.util.Arrays;
import java.util.Scanner;

public class Reverse_alphabetical_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String result = arrangeInReverseAlphabeticalOrder(word);

        System.out.println("Word arranged in reverse alphabetical order: " + result);
    }

    public static String arrangeInReverseAlphabeticalOrder(String word) {
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        StringBuilder reversed = new StringBuilder(new String(characters));
        return reversed.reverse().toString();
    }
}
