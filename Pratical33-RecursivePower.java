import java.util.Scanner;

public class RecursivePower{

    static int usHesaplayici(int taban,int kuvvet){


        if(kuvvet==1){
            return taban;


        }else{

            return taban*usHesaplayici(taban,kuvvet-1);

        }

    }


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz :");
        int taban= input.nextInt();;

        System.out.print("Üs değerini giriniz :");
        int kuvvet= input.nextInt();

        System.out.println(usHesaplayici(taban,kuvvet));

        }
    }




