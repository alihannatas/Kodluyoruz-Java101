import java.util.Scanner;

public class PalindromWords{

        public static boolean isPalindrom(String str){

                boolean control = false;
            for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {

                if (str.charAt(i) != str.charAt(j)) {
                    control=false;
                    break;
                } else {
                    control=true;
                }

            }

     return control;
        }

        public static void print(Boolean control, String name){

            if (control == true) {
                System.out.println(name + " kelimesi palindromik kelimedir.");
            } else {
                System.out.println(name + " kelimesi palindromik kelime degildir.");
            }

        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Lutfen bir kelime giriniz: ");
        String name = input.next();
        int control=3;

        print(isPalindrom(name),name);



    }
}

