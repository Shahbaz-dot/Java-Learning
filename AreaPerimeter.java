package Conditionalstatements;

import java.util.Scanner;
public class areaperimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = sc.nextInt();
        System.out.println("enter Bredth: ");
        int bredth = sc.nextInt();
        int area = length*bredth;
        int perimeter = 2 * (length + bredth);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter");

        }
        if(perimeter>area){
            System.out.println("Perimeter is greater than Area");
            
        }
        // if(perimeter==area)
        else{
            System.out.println("Area is equal to Perimeter ");
            sc.close();
        }
    }

    
}