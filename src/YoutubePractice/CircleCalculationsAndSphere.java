package YoutubePractice;

import java.util.Scanner;

public class CircleCalculationsAndSphere {
    public static void main(String[] args){

        double r,c,a,v;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of the Circle: ");
        r = sc.nextDouble();


        c = 2*Math.PI*r;
        a = Math.PI*(Math.pow(r,2));//or Math.PI*(r*r);
        v = (4.0/3.0)*Math.PI*(Math.pow(r,3));

        System.out.printf("Circumference of the Circle is: %.2f\n",c);
        System.out.printf("Area of the Circle is: %.2f\n",a);
        System.out.printf("Volume of the Sphere is: %.2f\n",v);

    sc.close();
    }
}
