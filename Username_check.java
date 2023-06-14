import java.util.Scanner;
public class Username_check
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = in.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username.");
        }
    }
    public static boolean isValidUsername(String username)
    {
        return username.matches("[a-zA-Z0-9_.@]{5,}");
    }
}
