import java.util.Scanner;

public class MethodPattern{

        static void desen(int a,int b, boolean durum){

                    if(a<=b) {
                        System.out.println(a);
                        if (a>0 && !durum) {
                            desen(a-5,b,false);
                        } else {
                            desen(a + 5,b, true);
                        }}}

        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);
	System.out.print("Lutfen bir sayi giriniz:");
        int a=input.nextInt();

        int b = a;

            desen(a,b,false);

        }
    }
