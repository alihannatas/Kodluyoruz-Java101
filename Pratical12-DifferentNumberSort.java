
import java.util.Scanner;

public class DifferentNumberSort{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,sayi3;

        System.out.print("Lutfen siralanacak 1.sayiyi giriniz:");
        sayi1=input.nextInt();

        System.out.print("Lutfen siralanacak 2.sayiyi giriniz:");
        sayi2=input.nextInt();

        System.out.print("Lutfen siralanacak 3.sayiyi giriniz:");
        sayi3=input.nextInt();

        if(sayi1 > sayi2 && sayi1> sayi3){
            if(sayi2>sayi3)  {
                System.out.println("Kucukten buyuge siralama="+sayi3 + "<" + sayi2 + "<"+ sayi1);
            }
            else {  System.out.println("Kucukten buyuge siralama="+sayi2 + "<" + sayi3 + "<" +sayi1);}
        }

        else if (sayi2> sayi1 && sayi2> sayi3){
            if(sayi1 > sayi3){
                System.out.println("Kucukten buyuge siralama="+sayi3 + "<" + sayi1 + "<" +sayi2 );
            }
            else {System.out.println("Kucukten buyuge siralama="+sayi1 + "<" + sayi2 + "<" +sayi2);}

        }

        else if (sayi3> sayi1 && sayi3> sayi2){
            if(sayi1 > sayi2){
                System.out.println("Kucukten buyuge siralama="+sayi2 + "<" + sayi1 + "<" +sayi3);
            }
            else {System.out.println("Kucukten buyuge siralama="+sayi1 + "<" + sayi2 + "<" +sayi3);}

        }


    }
}


