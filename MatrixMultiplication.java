import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        int row1,row2,col1,col2,i,j,k;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows to be printed in first matrix : ");
        row1 = in.nextInt();

        System.out.print("Enter the number of columns to be printed in first matrix : ");
        col1 = in.nextInt();

        System.out.print("Enter the number of rows to be printed in second matrix : ");
        row2 = in.nextInt();

        System.out.print("Enter the number of columns to be printed in second matrix : ");
        col2 = in.nextInt();

        if(col1!=row2)
        {
            System.out.print("Matrix Multiplication is not possible!! ");
            return;
        }
        int a[][]=new int [row1][col1];
        int b[][]=new int [row2][col2];
        int c[][]=new int [row1][col2];
        System.out.println("\nEnter the elements of matrix A : ");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.print("values");
    }
}
