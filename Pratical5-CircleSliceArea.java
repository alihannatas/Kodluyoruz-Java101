import java.util.Scanner;

public class CircleSliceArea{


    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        double pi=3.14,radius, centerAngle, area;

        System.out.print("Please, enter center angle:");
        centerAngle=input.nextDouble();
        System.out.print("Please, radius:");
        radius=input.nextDouble();

        area= (pi *  (radius * radius) * centerAngle) /360;

        System.out.print("Area of the circle=" + area);



    }

}
