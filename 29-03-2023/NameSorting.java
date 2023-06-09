import java.util.Scanner;
public class NameSorting
{
    public static void main(String[] args)
    {
        int n;
        String temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of names to be sorted :");
        n = in.nextInt();
        String names[] = new String[n];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all the names to be sorted :");
        for(int i = 0; i < n; i++)
        {
            names[i] = s.nextLine();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(names[i] + ",");
        }
        System.out.print(names[n - 1]);
    }
}
