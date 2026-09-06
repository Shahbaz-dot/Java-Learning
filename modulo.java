package Basicofjava.javainput;

import java.util.Scanner;
public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 45;
        int b = 8;
        // remainder by modulo
        int r = a%b;
        System.out.println(r);
        sc.close();
    }
    
}