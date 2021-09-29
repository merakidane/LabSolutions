package lab3;

import java.util.Scanner;

public class CentimeterTofeet {
    public static void main(String[] args) {
        double cen,inch;
        double feet;
        Scanner input=new Scanner(System.in);
        System.out.println("input the centimeters");
        cen=input.nextDouble();
        inch=2.54*cen;
        feet=0.038084*cen;
        System.out.println("we have "+inch+"in"+cen);
        System.out.println("we have"+feet +"in "+cen);

    }
}
