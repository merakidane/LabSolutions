package lab3;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class YearBorn {
    public static void main(String[] args) {
        int bornyear;

        Scanner input=new Scanner(System.in);
        System.out.println("input the year was born ");
        bornyear= input.nextInt();
        Date cyear=new Date();
        SimpleDateFormat current= new SimpleDateFormat("yyyy");

int age;
        age = Integer.parseInt(current.format(cyear))-bornyear;
        System.out.println("you will be  " +age + " this year");

    }
}
