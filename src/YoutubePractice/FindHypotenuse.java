package YoutubePractice;
import java.util.Scanner;
public class FindHypotenuse {
    public static void main(String[] args) {

        double l,w,hypo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the length of the triangle: ");
        l = sc.nextDouble();

        System.out.print("Insert the width of the triangle: ");
        w = sc.nextDouble();

        hypo = Math.sqrt((Math.pow(l,2)+Math.pow(w,2)));

        System.out.print("Hypotenuse is: "+ hypo);

        sc.close();
    }
}
