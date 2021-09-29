package lab2;
import java.util.Scanner;
public class Words {
    public static void main(String[] args) {


        String fname, lname;
        Scanner input = new Scanner(System.in);
        System.out.println("input your first name");
        fname = input.next();
        System.out.println("input your last name");
        lname = input.next();
        System.out.println(fname.charAt(0) + lname + "@miu.edu");
    }
}