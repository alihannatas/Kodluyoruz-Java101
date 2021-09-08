import java.util.Scanner;

public class AvgArray{

     public static   double avgArray(int[] arr){
            double avg=0;
            for(int i=0;i<arr.length;i++){

                avg+=arr[i];
            }

        return avg/arr.length;
        }



        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);


            int[] array={10,20,30,40,50,60};

            System.out.println(avgArray(array));
            

        }
    }
