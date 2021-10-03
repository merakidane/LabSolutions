package Lab5;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input the power of the base 10");
        int n= input.nextInt();

        if(n==6){
            System.out.println("Million");

    }
        else if(n==9){
            System.out.println("Billion");

        }
        else if(n==12){
            System.out.println("Trillion");

        }
        else if(n==15){
            System.out.println("Quadrillion");

        }
        else if(n==18){
            System.out.println("Quintillion");

        }
        else if(n==21){
            System.out.println("Sextillion");

        }
        else if(n==30){
            System.out.println("Nonillion");

        }
        else if(n==100){
            System.out.println("Googol");

        }
        else
            System.out.println("this input has no corresponding");


}}
