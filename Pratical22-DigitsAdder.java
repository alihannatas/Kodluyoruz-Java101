import java.util.Scanner;

public class DigitsAdder{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        int sayi= input.nextInt();

            int toplam=0,temp=0;


             while(sayi>0){

                 temp=sayi%10;
                 toplam+=temp;
                 sayi/=10;
             }
         System.out.println(toplam);


    }
}



