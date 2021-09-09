import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoze{

        public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of rows in the matrix:");
            int row=input.nextInt();

            System.out.print("Enter the number of column in the matrix: ");
            int column=input.nextInt();

            int[][] arrayy=new int[row][column];
            int[][] transposeMatrix=new int[column][row];

            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    System.out.print("Matris["+i+"]["+j+"] elemani giriniz:");
                    arrayy[i][j]=input.nextInt();
                }
            }

                for(int i=0;i<row;i++){
                    for(int j=0;j<column;j++){

                        transposeMatrix[j][i]=arrayy[i][j];
                    }
                }

            System.out.println("Matris:");
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){

                    System.out.print(arrayy[i][j]+"\t");;

                }
                System.out.println();
            }

            System.out.println("Transpoze:");
            for(int i=0;i<column;i++){
                for(int j=0;j<row;j++){

                    System.out.print(transposeMatrix[i][j]+"\t");;

                }
                System.out.println();
            }

        }
    }
