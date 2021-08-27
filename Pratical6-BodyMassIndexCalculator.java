import java.util.Scanner;

public class BodyMassIndexCalculator{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        double weight,height,bodyMassIndex;

        System.out.print("Enter your height(meter)=");
        height=input.nextDouble();
        System.out.print("Enter your weight(kg)=");
        weight=input.nextDouble();

        bodyMassIndex =   weight  / (height*height);

        System.out.println("Body mass index="+ bodyMassIndex);



    }

}
