import java.util.Scanner;

public class FibonacciSeries{

    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

                int sonraki=0,onceki=1,temp,fib, n;
        System.out.print("Kac elemanlı Fibonacci Serisi istiyorsunuz:");
                n= input.nextInt();

                for(int i=0;i<n;i++){

                    fib=onceki+sonraki;
                    System.out.print(fib+" ");
                    temp=sonraki;
                    sonraki+=onceki;
                    onceki=temp;

                }







        }
    }




