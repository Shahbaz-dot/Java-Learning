package Basicofjava.javainput;

import java.util.Scanner;
public class inputforsquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");

        int a = sc.nextInt();
        int b = a*a;
        System.out.println("The sqaure of b is: "+b);
          sc.close();
    }


}