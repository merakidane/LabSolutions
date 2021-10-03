package lab3;

import java.util.Scanner;

public class CentimeterTofeet {
    public static void main(String[] args) {
        double cen;
        double foot;
        Scanner input=new Scanner(System.in);
        System.out.println("input the centimeters");
        cen=input.nextDouble();
        foot=0.038084*cen;
        double inch = foot*12;
       System.out.println("we have "+inch+" inches in"+cen+" cents");
        System.out.println("we have "+foot +" feet in "+cen+" cents");

    }
}
