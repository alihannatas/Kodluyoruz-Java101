import java.util.Scanner;

public class FindRepeatingElement{


    public static void repetitive(int[] arr){

            int temp;
                for(int i=0;i<arr.length;i++){
                    temp=arr[i];
                    for(int j=i+1;j<arr.length;j++){

                            if(temp==arr[j] && temp%2==0){
                                System.out.println(temp+ " elemani tekrar ediyor");
                                break;
                            }
                    }
                }
    }

        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int[] arr={1,2,3,4,5,6,2,15,37,44,100,50,60,44,1};

        repetitive(arr);


        }
    }
