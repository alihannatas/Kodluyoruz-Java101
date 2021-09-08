import java.util.Arrays;
import java.util.Scanner;

public class FindTheNumberOfRepeatingElements{
        public static  void sortArray(int[] arr){   // priority  <

            int temp;
            for(int i=0;i<arr.length;i++){

                for(int j=i+1;j<arr.length;j++){

                    if(arr[i]>arr[j]){

                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

            int[] array={10, 20, 20, 10, 10, 20, 5, 20};
            int tekrar,temp=0;
            sortArray(array);     // arrayi kucukten buyuge siraladim

                for(int i=temp;i< array.length;i+=temp){
                            tekrar=1;       // alt dongu her bitisde tekrari 1 den baslattim.
                        for(int j=i+1;j<array.length;j++){

                                if(array[i]== array[j]){

                                    tekrar++;
                                    temp=j;  // ayni elemanlari defalarca saymamak icin  sayilar birbirine esit oldukca tempi j ile guncelledim.
                                }
                        }
                            if(temp==0){temp++;}
                    System.out.println(array[i]+" sayisi " + tekrar+ " kere tekrar edildi.");

                }
        }
    }
