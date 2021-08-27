import java.util.Scanner;

public class GroceryCashieProgram{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);




        double pear=2.14, pearKg, apple=3.67, appleKg , tomatoes=1.11, tomatoesKg, banana=0.95, bananaKg, aubergine=5, aubergineKg,amount=0;

        System.out.print("How many kilos of pear? ");
        pearKg=input.nextDouble();
        System.out.print("How many kilos of apples? ");
        appleKg=input.nextDouble();
        System.out.print("How many kilos of tomatoes? ");
        tomatoesKg=input.nextDouble();
        System.out.print("How many kilos of banana? ");
        bananaKg=input.nextDouble();
        System.out.print("How many kilos of aubergine? ");
        aubergineKg=input.nextDouble();


        amount= (pear * pearKg)+ (apple * appleKg)+ (tomatoes * tomatoesKg) + (banana * bananaKg)+ (aubergine * aubergineKg);

        System.out.print("Total amount:"+amount);

    }

}
