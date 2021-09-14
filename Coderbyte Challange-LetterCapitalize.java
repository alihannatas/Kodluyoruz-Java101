import java.util.Locale;
import java.util.Scanner;

public class LetterCapitalize{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your sentence:");
        String deneme=input.nextLine();
        String last = " ";
        String[] asd = deneme.split(" ");


        for (int i = 0; i < asd.length; i++) {
            String a = asd[i].substring(0, 1);
            String b = a.toUpperCase();
            asd[i] = b + asd[i].substring(1, asd[i].length()) + " ";

            last += asd[i];
            last.trim();
        }

        System.out.println(last);
    }
}

