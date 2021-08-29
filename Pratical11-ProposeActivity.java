
import java.util.Scanner;

public class ProposeActivity{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sicakligini giriniz:");
        int havaSicakligi=input.nextInt();
        int secim=0;

            if(havaSicakligi<5){secim+=1;}
            else if(havaSicakligi>=5  &&  havaSicakligi<=15) {secim+=2;}
            else if(havaSicakligi>15 && havaSicakligi<=25) {secim+=3;}

        switch (secim){

            case 1 :
                System.out.println("Bugun kayaga yapabilirsiniz");
                break;

            case  2:
                System.out.println("Bugun sinemeya gidebilirsiniz.");
                break;

            case 3 :
                System.out.println("Bugun piknige gidebilirsiniz.");
                break;
            default:
                System.out.println("Bugun yüzmeye gidebilirsiniz.");
                break;
        }


    }
}


