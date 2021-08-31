import java.util.Scanner;

public class PowerCalculatorWithInput{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int taban,kuvvet;

        System.out.print("Hesaplanacak sayinin tabanini girin:");
        taban=input.nextInt();

        System.out.print("Hesaplanacak sayinin ussunu girin:");
        kuvvet=input.nextInt();

        int temp=taban;
        if(kuvvet!=0){
        for(int i=0;i<kuvvet-1;i++){

            taban*=temp;

        }
            System.out.println("Sonuc= "+taban);
        }
        else{
            System.out.println("Sonuc= "+1);
        }




    }
}



