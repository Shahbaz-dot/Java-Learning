package Conditionalstatements;

import java.util.Scanner;

public class greatestthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        if(a>b && a>c){ // a is max
            System.out.println(a + " is a largest ");
        }
        else if(b>a && b>c){ // b is max
            System.out.println(b + " is a largest ");
        }
        else{ // c is largest
            System.out.println(c + " is a largest ");
            sc.close();
        }

    }
    
}