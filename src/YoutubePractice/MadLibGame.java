package YoutubePractice;
import java.util.Scanner;

public class MadLibGame {

   public static void main(String[] args) {
       String adj1;
       String noun1;
       String adj2;
       String verb1;
       String adj3;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter an Adjective:");
       adj1 = sc.nextLine();

       System.out.print("Enter an noun:");
       noun1 = sc.nextLine();

       System.out.print("Enter an Adjective:");
       adj2 = sc.nextLine();

       System.out.print("Enter an verb:");
       verb1 = sc.nextLine();

       System.out.print("Enter an Adjective:");
       adj3 = sc.nextLine();

       System.out.println("Today I went to a "+ adj1 +" Zoo" );
       System.out.println("I saw "+ noun1 +" the gorilla");
       System.out.println(noun1 +" was "+ adj2 +" and "+ verb1+ "!");
       System.out.println("I was "+ adj3 +"!" );
   }


}
