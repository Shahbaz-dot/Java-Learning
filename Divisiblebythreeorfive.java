package Conditionalstatements;

import java.util.Scanner;
public class divisblebythreeorifve {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n = sc.nextInt();
        
        if(n%5==0 || n%3==0){
            System.out.println("The number is divisible by 5 or 3 ");

        }
        else{
            System.out.println("Not divisible by 3 0r 5 ");
            sc.close();
        }

        

 }
 }