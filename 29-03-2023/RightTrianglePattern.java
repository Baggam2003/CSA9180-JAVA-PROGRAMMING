import java.util.Scanner;
public class RightTrianglePattern {
    public static void main(String args[]){
        int  rows,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of rows to be printed : ");
        rows=in.nextInt();
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
