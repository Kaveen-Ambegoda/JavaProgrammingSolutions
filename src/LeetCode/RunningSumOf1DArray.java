package LeetCode;

import java.util.Scanner;

public class RunningSumOf1DArray {


    public static void main(String[] args) {

        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        size = sc.nextInt();


    if(size>=1 && size<=100){
        int[] num = new int[size];
        int[] runningSum = new int[size];


        for(int i=0;i<size;i++){
            System.out.printf("Please Enter the value for the array place %d:",i);
            num[i] = sc.nextInt();


        }

        runningSum[0] = num[0];

        for(int i = 1; i <size; i++){
            runningSum[i] = runningSum[i-1]+num[i];
        }

        for(int i = 0 ; i < runningSum.length; i++){
            System.out.print(runningSum[i]+" ");
        }
        sc.close();
    }
    else{
        System.out.print("Invalid size");
    }
    }
}
