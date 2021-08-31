
import java.util.Scanner;

public class Homework {


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

       int sayi,toplam=0,sayiMiktari=0;
       sayi=input.nextInt();

        for(int i=0;i<=sayi;i++){

            if(i%3==0 && i%4==0)
            {
                toplam+=i;
                sayiMiktari++;
            }


        }
        System.out.println("Ortalama=" + (toplam/sayiMiktari));

    }
}



