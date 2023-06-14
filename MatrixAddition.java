import java.util.Scanner;
public class MatrixAddition{
    public static void main(String args[]){
        int row1,row2,col1,col2,i,j;
//creating two matrices
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of first matrix : ");
        row1 = in.nextInt();

        System.out.print("Enter the number of columns in first matrix : ");
        col1 = in.nextInt();

        System.out.print("Enter the number of rows of second matrix : ");
        row2 = in.nextInt();

        System.out.print("Enter the number of columns of second matrix : ");
        col2 = in.nextInt();

        int a[][]=new int [row1][col1];
        int b[][]=new int [row2][col2];

//creating another matrix to store the sum of two matrices
        int c[][]=new int[3][3];  //3 rows and 3 columns

//adding and printing addition of 2 matrices
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];    //use - for subtraction
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }
    }}