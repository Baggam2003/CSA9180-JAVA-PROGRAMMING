import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
        int i,j,rows;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows to be printed : ");
        rows = in.nextInt();
        for (i = rows; i >= 1; i--)
        {
            for (j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
