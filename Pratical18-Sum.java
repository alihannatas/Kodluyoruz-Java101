
import java.util.Scanner;

public class Sum{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int sayi,toplam=0;


            do{
                System.out.print("Lutfen bir sayi giriniz:");
                sayi=input.nextInt();

                if(sayi%4==0){

                    toplam+=sayi;
                }

            }while(sayi%2==0);

                System.out.print("Toplam="+toplam);

    }
}



