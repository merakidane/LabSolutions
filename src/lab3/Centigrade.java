package lab3;

import java.util.Scanner;

public class Centigrade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double fahrenheit,centigrade;
        System.out.println("input the degree in centigrade");
        centigrade=input.nextDouble();
        fahrenheit=1.8*centigrade+32;
        System.out.println(fahrenheit+" "+" fahrenheit");

    }
}
