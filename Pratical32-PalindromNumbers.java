import java.util.Scanner;

public class PalindromNumbers{


        static boolean isPalindrom(int sayi){

            int temp=sayi, tersSayi=0,kalan;

                while(temp >0){
                    kalan=0;
                    kalan=temp%10;
                    temp/=10;
                    tersSayi= (tersSayi * 10) + kalan;
                }

            if(tersSayi==sayi){return true;}
            else              {return false;}
        }

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol edilecek sayiyiy giriniz:");
        int sayi= input.nextInt();

        if( isPalindrom(sayi)==true){
            System.out.println("Palindrom sayidir.");
        }
        else{
            System.out.println("Palindrom sayi degildir.");
        }




        }
    }




