import java.util.Scanner;
public class SquaresAndCubes
{
    public static void main(String args[]) {
        float num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        num = in.nextFloat();
            System.out.print("The Square of " + num + " is " + num*num);
            System.out.print("\nThe Cube of " + num + " is " + num*num*num);
    }
}
