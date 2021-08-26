import java.util.Scanner;
public class AvgGrade {


            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int mat,physical,chemical,language,music,history;

                System.out.println("Please enter your math grade:");
                mat=input.nextInt();
                System.out.println("Please enter your physical grade:");
                physical=input.nextInt();
                System.out.println("Please enter your chemical grade:");
                chemical=input.nextInt();
                System.out.println("Please enter your language grade:");
                language=input.nextInt();
                System.out.println("Please enter your music grade:");
                music=input.nextInt();
                System.out.println("Please enter your history grade:");
                history=input.nextInt();

                double avg= (mat+physical+chemical+language+music+history)/6;
                boolean x = avg >= 60;
                System.out.println("Grade average:"+avg+", " +(x==true ? "Pass" : "Missed"));
            }

                  }


