import java.util.Scanner;
public class FullPyramidPattern
{
    public static void main(String args[]) {
        int rows, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed : ");
        rows = in.nextInt();
        for (i = 0; i < rows; i++)
        {
            for(j=rows-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
