import java.util.Scanner;
public class remainderfindasinput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend: ");
       int a = sc.nextInt();
        System.out.println("Enter divisor: ");
        int b = sc.nextInt();

       int q = a/b;
       int r = a - (b*q);
        System.out.println("the remiander when " +a+ " is divide by" +b+ "is" +r);
        sc.close();
    }