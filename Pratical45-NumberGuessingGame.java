import java.util.Arrays;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println(number);
        int health = 5;
        boolean control = false;

        for (int i = 0; i < health; ) {
            System.out.print("Lutfen sayi giriniz(0-100): ");
            int numberr = input.nextInt();
            if (number == numberr) {

                control = true;
                break;
            } else {
                i++;
                System.out.println("Hatali bir sayi girdiniz.");
                System.out.println("Kalan hakkiniz: " + (health - i));
                if (number > numberr) {
                    System.out.println(numberr + " sayisi gizli sayidan kucuktur.");
                } else {
                    System.out.println(numberr + " sayisi gizli sayidan buyuktur.");
                }
            }
        }

        if (control == true) System.out.println("Tebrikler sayiyi dogru buldunuz.\n Sayi : " + number);
        else System.out.println("You lost the game");

    }
}
