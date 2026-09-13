package Conditionalstatements;

import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght: ");
        int length = sc.nextInt();
        System.out.println("Enter bredth: ");
        int bredth = sc.nextInt();
      
        if(length == bredth){
            System.out.println("Yes It is Square");
        }
        else{
            System.out.println("not a square ");
        sc.close();
    }

    }
    
}