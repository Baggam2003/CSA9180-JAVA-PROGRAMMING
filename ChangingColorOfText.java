import java.util.Scanner;
public class ChangingColorOfText
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args)
    {
        System.out.println(ANSI_YELLOW
                + "This text is yellow"
                + ANSI_RESET);
    }
}