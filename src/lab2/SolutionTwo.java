package lab2;

import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String names;
        System.out.println("input the string");
        names=input.nextLine();
        System.out.println(names.length());
        System.out.println(names.charAt(0));
        System.out.println(names.charAt(names.length()-1));




    }
}
