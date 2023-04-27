import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String args[])
    {
        int num,i=1,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = in.nextInt();
        while(i <= num/2)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==num)
        {
            System.out.println(num+" is a perfect number ");
        }
        else
            System.out.println(num+" is not a perfect number ");
    }
}  