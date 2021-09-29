package lab2;

import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
String fname,lname,middle;
        System.out.println("input your first name");
        fname=input.next();
        System.out.println("input your middle name");
        middle=input.next();
        System.out.println("input your last name");
        lname=input.next();
        String fullname= fname + "  "+ middle.charAt(0)+"."+" "+lname;
        System.out.println(fullname);

    }
}
