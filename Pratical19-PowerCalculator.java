
import java.util.Scanner;

public class PowerCalculator{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int sayi, dort=4,bes=5;
        System.out.print("Bir sayi giriniz:");
        sayi= input.nextInt();

        System.out.println("Dordun "+0+".kuvveti "+ 1);
            for(int i=1;dort<=sayi;i++){


                System.out.println("Dordun "+i+".kuvveti "+ dort);
                dort*=4;

            }
        System.out.println();
        System.out.println("Besin "+0+".kuvveti "+ 1);
        for(int i=1;bes<=sayi;i++){


            System.out.println("Besin "+i+".kuvveti "+ bes);
            bes*=5;

        }


    }
}



