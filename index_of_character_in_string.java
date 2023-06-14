import java.util.Scanner;

public class index_of_character_in_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);

        int index = findCharacter(inputString, searchChar);

        if (index != -1) {
            System.out.println("Character '" + searchChar + "' found at index " + index);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
    }

    public static int findCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }

        return -1; // Character not found
    }
}
