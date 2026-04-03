
package YoutubePractice;

import java.util.Scanner;

public class ShoppingCartProgramme {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    char currency = '$';
    double total;

    System.out.print("what are you going to buy?");
    item = sc.nextLine();

    System.out.print("what is the price for each?");
    price = sc.nextDouble();

    System.out.print("How many would you like to buy?");
    quantity= sc.nextInt();

    total  = price * quantity;

    System.out.print("You have bought "+quantity+ " "+ item + "/s");
    System.out.println("and your price is "+currency+total);
}

}
