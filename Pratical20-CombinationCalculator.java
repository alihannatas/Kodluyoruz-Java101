import java.util.Scanner;

public class CombinationCalculator{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

            int N,r;

        System.out.println(" N’in r’li kombinasyonu C(n,r) gosterilir.");

        System.out.print("N degerini giriniz:");
        N= input.nextInt();

        System.out.print("r degerini giriniz:");
        r= input.nextInt();

         int a=1,b=1,c=1;

            for(int i=1;i<=N;i++){

                a*=i;
            }
            for(int i=1;i<=r;i++){

            b*=i;
             }
             for(int i=1;i<=N-r;i++){

            c*=i;
             }

           double d= a / (b*c);
        System.out.println( "C("+N+","+r+")="+ d);

    }
}



