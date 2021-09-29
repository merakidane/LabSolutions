package lab2;
import java.util.Scanner;
public class SolutionThree {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("input the word");
        String res=input.nextLine();
       int resmid=res.length()/2;
        System.out.println(res.charAt(resmid));

    }
}
