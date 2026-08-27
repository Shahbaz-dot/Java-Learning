package Basicofjava;

public class mutliplevariable {
    public static void main(String[] args){
        // left to right check hoti
        int x = 5, y = 6, z = 7;
        System.out.println("The value of x is " + x);
        // System.out.println(x);
        System.out.println("The value of y is "+ y);
        // System.out.println(y);
        z = 10;
        z = x + z;
        System.out.println("the value of z is " + z);

        System.out.println(x+y+z);
        System.out.println("best things "+x+y+z);
        // sout("text"+ "5"+"6"+"15")
        System.out.println(x+y+""+z);

    }
    
} 