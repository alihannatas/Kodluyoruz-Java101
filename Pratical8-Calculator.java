import java.util.Scanner;

public class Calculator{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);


        double number1,number2;
        int vote;

        System.out.print("Enter first number:");
        number1=input.nextDouble();
        System.out.print("Enter second number:");
        number2=input.nextDouble();
        System.out.println("1-ADD\n2-Minus\n3-Multiplication\n4-Divede");
        vote=input.nextInt();
        switch (vote){

            case 1:

                System.out.print("Sum=" + (number1+number2));
                break;

            case 2:
                System.out.print("Minus=" + (number1+number2));
                break;

            case 3:
                System.out.print("Multiplication=" + (number1*number2));
                break;

            case 4:
                System.out.print("Divede=" + (number1/number2));
                break;
            default:
                System.out.println("Wrong value entered");
                break;

        }



    }

}
