import java.util.Scanner;

public class TaxCalculator{


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        double productAmount;
        System.out.println("Please enter product amount:");
        productAmount=input.nextDouble();

        double tax =  (productAmount * 18) / 100 ;

        System.out.println("Tax="+tax);
        System.out.println("Total="+ (tax+productAmount));

    }

}
