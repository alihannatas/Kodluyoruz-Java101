import java.util.Arrays;
import java.util.Scanner;

public class Homework {

     public static   void maxMin(int[] arr,int value){
         Arrays.sort(arr);
         int max=0,min=0;
                    for(int i=0;i<arr.length;i++){

                            if(value < arr[i]){
                                max=arr[i];
                                min=arr[i-1];
                                break;
                            }
                    }
         System.out.println("Girilen sayi :" + value);
         System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
         System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

        }

        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

            int[] array={15,12,788,1,-1,-778,2,0};
            maxMin(array,5);

            
        }
    }
