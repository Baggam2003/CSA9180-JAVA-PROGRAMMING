import java.util.Scanner;
public class ReversingNumber
{
    public static void reverseNumber(int number)
    {
        if (number < 10)
        {
            System.out.println(number);
            return;
        }
        else
        {
            System.out.print(number % 10);
            reverseNumber(number/10);
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter the number to be reversed : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("The reverse of the given number is: ");
        reverseNumber(num);
    }
}