package Conditionalstatements;

import java.util.Scanner;
public class divisblebythreandfiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n = sc.nextInt();
        // if(n%15==0) same as 3 and 5
        if(n%5==0 && n%3==0){
            System.out.println("The number is divisible by 3 and 5");

        }
        else{
            System.out.println("Not divisible by 3 and 5");
            sc.close();
        }

        

    }
}