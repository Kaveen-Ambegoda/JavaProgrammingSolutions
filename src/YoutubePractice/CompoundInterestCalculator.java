package YoutubePractice;
import java.util.Scanner;
import static java.lang.Math.pow;

public class CompoundInterestCalculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double principal,rate,amount;
        int cYear,years;

        System.out.println("Enter the Principal amount: ");

        principal = sc.nextDouble();

        System.out.println("Enter the Interest Rate: ");
        rate = sc.nextDouble()/100;

        System.out.println("Enter the number of years taken as Compound: ");
        cYear = sc.nextInt();

        System.out.println("Enter the number of years: ");
        years = sc.nextInt();


        amount = principal*(pow((1+rate/cYear),years*cYear));

        System.out.printf("The Amount after %d years is: %.2f",years,amount);

        sc.close();


    }
}
