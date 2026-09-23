package Conditionalstatements;

import java.util.Scanner;
public class twodigitnumber {
    public static void main(String[] args) {

        // for 3 digit number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        if(n>10 && n<100){
            System.out.println("This is a 2 digit number ");

        }
        else{
            System.out.println("It is a not a 2 digit number ");
            sc.close();
        }
    }
    
}
