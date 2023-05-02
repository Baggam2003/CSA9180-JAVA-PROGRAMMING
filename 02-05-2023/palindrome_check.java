import java.util.Scanner;
import java.lang.*;
public class palindrome_check
{
    public static void strings ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        String rev = "";
        for(int i = ch.length-1;i>=0;i--)
        {
            rev = rev+ch[i];
        }
        if(s.equals(rev))
        {
            System.out.print("It is a Palindrome");
        }
        else
        {
            System.out.print("It is not a Palindrome");
        }
    }

    public static void integers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int s = sc.nextInt();
        int d = s,rev=0;
        while(d!=0)
        {
            int temp = d%10;
            rev = rev*10 + temp;
            d = d/10;
        }
        if(s==rev)
        {
            System.out.print("It is a Palindrome");
        }
        else
        {
            System.out.print("It is not a Palindrome");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer or String(1 for String , 2 for Integer): ");
        String ans = sc.nextLine();
        if(ans.equals("1"))
        {
            strings();
        }
        else
        {
            integers();
        }
    }
}