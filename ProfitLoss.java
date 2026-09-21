package Conditionalstatements;

import java.util.Scanner;
public class profitloss {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost Price : ");
        int cp = sc.nextInt();
        System.out.println("Enter Selling price: ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.print("Your Profit is :");
            int profit = sp - cp;
            System.out.println(profit);
        }
        if(cp>sp){
            System.out.println("Your loss : ");
            int loss = cp - sp;
            System.out.println(loss);
        sc.close();
        }


    }
}