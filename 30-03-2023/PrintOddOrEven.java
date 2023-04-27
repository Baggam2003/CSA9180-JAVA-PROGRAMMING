import java.util.*;
public class PrintOddOrEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int n = in.nextInt();
        String odd = " ";
        String even = " ";
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                even = even + i + " ";
            }
            else
            {
                odd = odd + i + " ";
            }
        }
        System.out.print("Odd Numbers in the given range are : " + odd + "\n" + "Even Numbers in the given range are : " + even);

    }
}