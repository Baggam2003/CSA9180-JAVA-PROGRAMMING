import java.util.Scanner;
public class print_special_characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = in.nextLine();

        int specialCharCount = 0;
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (isSpecialCharacter(ch)) {
                specialChars.append(ch);
                specialCharCount++;
            }
        }

        System.out.println("Special characters found: " + specialChars.toString());
        System.out.println("Number of special characters: " + specialCharCount);
    }
    public static boolean isSpecialCharacter(char ch) {
        return !Character.isWhitespace(ch) && !Character.isLetterOrDigit(ch);
    }
}
