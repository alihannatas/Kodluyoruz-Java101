import java.util.Scanner;

public class PrimeNumbersCheck{


        static  void asalKontrol(int a){

            int kontrol=0;

                for(int i=2;i<a/2;i++){

                        if(a%i==0 ){
                            kontrol=1;
                            break;
                        }
                }
            if(kontrol==1){
                System.out.println("Asal degildir.");
            }
            else {
                System.out.println("Asaldir.");
            }

        }

        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

            System.out.print("Fibonacci serisinin kacinci sayisini gormek istiyorsunuz:");
            int a=input.nextInt();
            asalKontrol(a);



        }
    }




