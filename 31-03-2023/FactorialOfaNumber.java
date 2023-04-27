import java.util.Scanner;
public class FactorialOfaNumber
{
    public static void main(String args[])
    {
        int i,fact=1,num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = in.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of " + num + " is : " + fact);
    }
}  