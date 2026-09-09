package Basicofjava.chardata;

import java.util.Scanner;
public class chardatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'a';
        System.out.println(ch);
        // a b c d e f g h i j k l m n o p q r s t u v w x y z
        // capital also
        // ! @ # $ % ^ & * ( ){ } [ ] | \ / ; ; :' ' "" 
        // 0 1 2 3 4 5 6 7 8 9 

        // ASCII value a = 97 ....... z = 133
        // A = 65........Z= 90

        // for ASCII value
        int x = (int)ch;
        System.out.println(x);
        sc.close();
    }