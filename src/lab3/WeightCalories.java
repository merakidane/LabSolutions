package lab3;

import java.util.Scanner;

public class WeightCalories {
    public static void main(String[] args) {
        double weight;
        Scanner input=new Scanner(System.in);
        System.out.println("input the weight in pound");
        weight=input.nextDouble();
        double calories=weight*19;
        System.out.println("the calories number you need per day is = "+calories);



    }
}
