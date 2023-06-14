import java.util.Scanner;

public class vowels_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String statement = in.nextLine();

        int vowelCount = countVowels(statement);

        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String statement) {
        int count = 0;

        for (int i = 0; i < statement.length(); i++) {
            char ch = Character.toLowerCase(statement.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
