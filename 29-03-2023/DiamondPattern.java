import java.util.Scanner;
public class DiamondPattern
{
    public static void main(String args[])
    {
        int rows,i,j,space = 1;
        System.out.print("Enter the number of rows to be printed : ");
        Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        space = rows - 1;
        for (j = 1; j<= rows; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= rows - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (rows - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
