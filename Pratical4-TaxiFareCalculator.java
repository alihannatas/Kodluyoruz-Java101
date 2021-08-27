import java.util.Scanner;

public class TaxiFareCalculator{


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

              double perKilometer=2.2, amount=20,taximeterStart=10,wayTaken;

              System.out.print("What is the distance traveled:");
              wayTaken=input.nextDouble();

              amount+=  (wayTaken * perKilometer) + taximeterStart;
              System.out.println("Taxi amount="+ amount);




    }

}
