package Conditionalstatements;

import java.util.Scanner;
public class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
            // sc.close();
        }
        else{
            System.out.println("The number you eneterd is odd");
            sc.close();
        }
        
        

    }
}