package Conditionalstatements;

import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {

        // for 3 digit number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("This is a 3 digit number ");

        }
        else{
            System.out.println("It is a not a 3 digit number ");
            sc.close();
        }
    }
    
}