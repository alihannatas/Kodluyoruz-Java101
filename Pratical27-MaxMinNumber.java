import java.util.Scanner;

public class MaxMinNumber{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int min=2147483647,max=-2147483648,temp;

        System.out.println("Kaç tane sayı gireceksiniz:");
        int sayiMiktari=input.nextInt();

        for(int i=1;i<=sayiMiktari;i++){

            System.out.print(i+". Sayıyı giriniz:");
            temp=input.nextInt();
                if(temp< min){ min=temp;}
                if(temp>max){max=temp;}

        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En kucuk sayı:"+min);

    }
}



