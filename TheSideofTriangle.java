package Conditionalstatements;

import java.util.Scanner;

public class thesideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side : ");
        int a = sc.nextInt();
        System.out.println("Enter second secondr : ");
        int b = sc.nextInt();
        System.out.println("Enter third third : ");
        int c = sc.nextInt();

        if(a+b > c && b+c >a && a+c>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
            sc.close();
        }
    }
}
