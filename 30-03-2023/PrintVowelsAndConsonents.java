import java.util.Scanner;
public class PrintVowelsAndConsonents
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = in.nextLine().toLowerCase();
        in.close();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonents = new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels.append(ch).append(" ");
            }
            else if(Character.isLetter(ch));
            {
                consonents.append(ch).append(" ");
            }
        }
        System.out.println("Vowels : " + vowels.toString());
        System.out.println("Consonents : " + consonents.toString());
    }
}
