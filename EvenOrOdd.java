package Conditionalstatements;

import java.util.Scanner;

public class evenodd {
   public evenodd() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a number : ");
      int var2 = var1.nextInt();
      if (var2 % 2 == 0) {
         System.out.println("Even");
         var1.close();
      }

   }
}