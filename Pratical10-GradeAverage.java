
import java.util.Scanner;

public class GradeAverage {


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int matematik, fizik,turkce,kimya,muzik;

        System.out.print("Lutfen matematik sinav not ortalamanizi girin:");
        matematik=input.nextInt();
        if(matematik <0 ||  matematik>100){fizik=0;}

        System.out.print("Lutfen fizik sinav not ortalamanizi girin:");
        fizik=input.nextInt();
        if(fizik <0 ||  fizik>100){fizik=0;}

        System.out.print("Lutfen turkce sinav not ortalamanizi girin:");
        turkce=input.nextInt();
        if(turkce <0 ||  turkce>100){fizik=0;}

        System.out.print("Lutfen kimya sinav not ortalamanizi girin:");
        kimya=input.nextInt();
        if(kimya <0 || kimya>100){kimya=0;}

        System.out.print("Lutfen muzik sinav not ortalamanizi girin:");
        muzik=input.nextInt();
        if(muzik <0 || muzik>100){muzik=0;}

     double ortalama=  (matematik+fizik+turkce+kimya+muzik) / 5;


         if(ortalama>=55){

             System.out.print("Gecti.\nDers ortalamasi="+ ortalama);
         }
       else {

             System.out.print("Kaldi.\nDers ortalamasi="+ ortalama);
         }

    }
}


