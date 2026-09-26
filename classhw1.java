// any year is input thorugh the keyboards . write a program to determine whether the year is leap year or not 

package Conditionalstatements;

import java.util.Scanner;
public class hw1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");

        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap year: ");
        }
        else{
            System.out.println("Not a Leap year");
            sc.close();

            }
        }
    }