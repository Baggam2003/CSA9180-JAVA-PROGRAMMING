import java.util.Scanner;
public class SumofDigits
{
    public static void main(String args[])
    {
        int num,digit,sum=0;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = in.nextInt();
        while(num>0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.print("The number of digits in the number are : " + sum);
    }
}
