import java.util.Scanner;
public class FactorsOfaNum
{
    public static void main(String[] args)
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = in.nextInt();
        System.out.print("Factors of " + num + " are : ");
        if(num>0)
        {
            for (int i = 1; i <= num;i++)
            {
                if (num % i == 0)
                {
                    System.out.print(i + " ");
                }
            }
        }
        else
        {
            System.out.print("Enter a positive number!! ");
        }
    }
}