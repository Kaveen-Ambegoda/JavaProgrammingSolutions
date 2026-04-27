package YoutubePractice;
import java.util.Scanner;
public class WeightConversionProgramme {

    public static void main(String[] args) {

        int loop=1;
        Scanner sc = new Scanner(System.in);
        while(loop==1) {
            //converting user given weight(lb/kg),based on user choice
            System.out.println("If you want to convert kg to lbs insert '1'");
            System.out.println("If you want to convert lbs to kg insert '2'");

            double convertedWeight;



            System.out.print("Enter your choice: ");
            int c = sc.nextInt();

            System.out.println();

            if (c == 1 || c == 2) {

                System.out.print("Enter your weight:");
                double w = sc.nextDouble();

                if (w > 0) {
                    if (c == 1) {
                        convertedWeight = w * 2.2046;
                        System.out.printf("%.3f kg is %.3f lbs %n", w, convertedWeight);
                    } else {
                        convertedWeight = w / 2.2046;
                        System.out.printf("%.3f lbs is %.3f kg %n", w, convertedWeight);
                    }

                } else {
                    System.out.println("Invalid weight");
                }
            } else {
                System.out.println("Invalid choice");
            }



            System.out.println("Do you wish to continue? if No press '0', else press '1' ");
            loop = sc.nextInt();

            if(loop!=0 && loop != 1){
                System.out.println("Invalid choice");
                return;
            }


        }
        sc.close();
    }
}
