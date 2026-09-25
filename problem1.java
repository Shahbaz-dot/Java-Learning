package Conditionalstatements;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter zishan Age : ");
        int zishan = sc.nextInt();
        System.out.println("Enter Sunny Age : ");
        int sunny = sc.nextInt();
        System.out.println("Enter Wasif Age : ");
        int wasif = sc.nextInt();

        if(zishan>sunny && zishan>wasif){ // a is max
            System.out.println(zishan + " is Younger ");
        }
        else if(sunny>zishan && sunny>wasif){ // b is max
            System.out.println(sunny + " is a Younger ");
        }
        else{ // c is largest
            System.out.println(wasif + " is a Younger ");
            sc.close();
        }

    }
    
}