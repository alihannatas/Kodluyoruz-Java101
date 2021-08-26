import java.util.Scanner;

public class Homework {


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        int  a,b;
        double hypotenuse;

        System.out.println("Please enter a side length:");
        a=input.nextInt();
        System.out.println("Please enter a side length:");
        b=input.nextInt();

        hypotenuse =   Math.sqrt(a*a + b*b);

        System.out.println("Hypotenuse="+ hypotenuse);
    }

}
