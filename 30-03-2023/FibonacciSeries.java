import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {

        int n , firstTerm = 0, secondTerm = 1;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number to print fibonacci series : ");
        n = in.nextInt();
        System.out.println("Fibonacci Series until " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}