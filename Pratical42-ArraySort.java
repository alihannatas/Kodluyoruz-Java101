import java.util.Arrays;
import java.util.Scanner;

public class ArraySort{

            public static  void siralama(int[] arr){

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

            System.out.print("Dizinin boyutu:");
            int n= input.nextInt();
            int[] array=new  int[n];

            System.out.println("Dizinin elemanlarini giriniz:");
                for(int i=0;i<n;i++){
                    System.out.print((i+1) +".elemani:");
                    array[i]= input.nextInt();

                }

              siralama(array);

            System.out.println("Siralama: "+Arrays.toString(array));


        }
    }
