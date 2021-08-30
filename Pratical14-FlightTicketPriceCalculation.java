
import java.util.Scanner;

public class FlightTicketPriceCalculation{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int mesafe,yas, yolculukTipi;
        double toplamTutar=0;
        System.out.print("Mesafeyi km türünden giriniz:");
        mesafe=input.nextInt();

        System.out.print("Yaşınızı giriniz:");
        yas=input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi=input.nextInt();

        if(mesafe>0 && (yolculukTipi ==1 || yolculukTipi==2) ){
                if(yolculukTipi==1){
                        if(yas <12){
                            toplamTutar= mesafe * 0.1;
                            toplamTutar*=0.5;

                            System.out.println("Toplam Tutar = "+ toplamTutar);
                        }
                        else if(yas>=12 && yas<=24){
                            toplamTutar= mesafe * 0.1;
                            toplamTutar*=0.9;

                            System.out.println("Toplam Tutar = "+ toplamTutar);
                        }
                        else if(yas>65){
                            toplamTutar= mesafe * 0.1;
                            toplamTutar*=0.7;

                            System.out.println("Toplam Tutar = "+ toplamTutar);

                        }
                        else{
                            toplamTutar= mesafe * 0.1;

                            System.out.println("Toplam Tutar = "+ toplamTutar);
                        }
                }
                else {
                    if(yas <12){
                        toplamTutar= mesafe * 0.1;
                        toplamTutar*=0.5;
                        toplamTutar*=0.8;

                        System.out.println("Toplam Tutar = "+ toplamTutar*2);
                    }
                    else if(yas>=12 && yas<=24){
                        toplamTutar= mesafe * 0.1;
                        toplamTutar*=0.9;
                        toplamTutar*=0.8;

                        System.out.println("Toplam Tutar = "+ toplamTutar*2);
                    }
                    else if(yas>65){
                        toplamTutar= mesafe * 0.1;
                        toplamTutar*=0.7;
                        toplamTutar*=0.8;
                        System.out.println("Toplam Tutar = "+ toplamTutar*2);

                    }
                    else{
                        toplamTutar= mesafe * 0.1;
                        toplamTutar*=0.8;
                        System.out.println("Toplam Tutar = "+ toplamTutar*2);
                    }


                }
        }
        else{

            System.out.println("Hatali veri girdiniz!");
        }


    }
}



