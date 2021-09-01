import java.util.Scanner;

public class EbobEkok{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;

        System.out.print("1.sayiyi giriniz:");
        sayi1=input.nextInt();

        System.out.print("2.sayiyi giriniz:");
        sayi2=input.nextInt();

        int ebob=1,ekok=1;

            for(int i=1;i<= sayi1 || i<=sayi2; i++){
                if(sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                }
            }
            sayi1/=ebob;
            sayi2/=ebob;

            ekok=ebob * sayi1 * sayi2;

        System.out.println("Ebob="+ebob);
        System.out.println("Ekok="+ekok);
    }
}



