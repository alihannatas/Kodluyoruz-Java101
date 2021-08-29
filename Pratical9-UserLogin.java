
import java.util.Scanner;

public class UserLogin{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);
        String kullanciAdi,sifre,sifree="java123";


        System.out.println("Lutfen kullanici adi giriniz:");
        kullanciAdi=input.nextLine();

        System.out.println("Lutfen sifre giriniz:");
        sifre=input.nextLine();

             if(kullanciAdi.equals("patika") && sifre.equals(sifree)){

                System.out.println("Giris yaptiniz.");
        }
             else {

                 System.out.println("Sifreyi yanlis girdiniz.\n1-Sifre Degistir\n2-Programdan Cik.");
                 int giris=input.nextInt();

                        if(giris==1){

                            System.out.print("Lutfen yeni sifreyi girin:");
                            String yeniSifre=input.next();
                                    if(yeniSifre.equals(sifre)|| yeniSifre.equals(sifree)){

                                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                                    }
                                    else {
                                        System.out.println("Şifre oluşturuldu");
                                    }


                        }

                        else {
                            System.out.println("Programdan cikildi.");
                        }


             }




    }
}


