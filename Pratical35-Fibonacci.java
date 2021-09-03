import java.util.Scanner;

public class Homework {


            static int Fibonacci(int a){

               if(a==1 || a==2){
                   return 1;
               }
                return Fibonacci(a-1) + Fibonacci(a-2);
    }

        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

            System.out.print("Fibonacci serisinin kacinci sayisini gormek istiyorsunuz:");
            int a=input.nextInt();

            System.out.println(Fibonacci(a));
            
        }
    }




