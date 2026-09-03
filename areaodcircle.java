package Basicofjava.javainput;

import java.util.Scanner;

public class areaofcirclewithinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");

        int radius ;
        radius = sc.nextInt();
        double pi = 3.14;
        double area = pi*radius*radius;
        System.out.println("The Area of circle is: "+area);
        sc.close();
    }
}