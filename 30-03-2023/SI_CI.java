import java.util.Scanner;
import java.lang.Math;
public class SI_CI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount : ");
        double principle = input.nextDouble();

        System.out.print("Enter rate of interest : ");
        double rate = input.nextDouble();

        System.out.print("Enter the time : ");
        double time = input.nextDouble();

        double S_I = (principle * time * rate) / 100;
        double C_I = principle*(1+(rate/100));

        System.out.println("Principle amount : " + principle);
        System.out.println("Interest Rate : " + rate + "%");
        System.out.println("Time Duration : " + time + " years");
        System.out.println("Simple Interest : " + S_I);
        System.out.println("Compound Interest : " + C_I);

        input.close();
    }
}