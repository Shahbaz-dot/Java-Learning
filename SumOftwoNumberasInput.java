package Basicofjava.javainput;

import java.util.Scanner;

public class sumof2numbersininput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Value of x is : ");

        // int x ;
        // x = sc.nextInt();

        int x = sc.nextInt();
        System.out.println("the value of y is: ");
        int y ;
        y = sc.nextInt();

        int  z = x + y;
        System.out.println("The Sum of two numbers is: "+z);
        sc.close();
    }
    
}