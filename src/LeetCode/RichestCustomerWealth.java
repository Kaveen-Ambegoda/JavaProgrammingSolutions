package LeetCode;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.print("Enter number of customers (rows): ");
        m = sc.nextInt();

        System.out.print("Enter number of banks (columns): ");
        n = sc.nextInt();

        int[][] accounts = new int[m][n];


        for (int i = 0; i < m; i++) {
            System.out.println("Enter values for customer " + i + ":");
            for (int j = 0; j < n; j++) {
                System.out.print("Bank " + j + ": ");
                accounts[i][j] = sc.nextInt();
            }
        }

        int maxWealth = 0;


        for (int i = 0; i < accounts.length; i++) {

            int currentWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        System.out.println("Richest Customer Wealth: " + maxWealth);

        sc.close();
    }
}