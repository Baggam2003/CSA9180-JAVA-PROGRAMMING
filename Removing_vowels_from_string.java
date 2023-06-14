import java.util.Scanner;

public class Removing_vowels_from_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = removeVowels(inputString);

        System.out.println("String after removing vowels: " + result);
    }

    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
