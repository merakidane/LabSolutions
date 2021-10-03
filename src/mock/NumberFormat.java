package mock;

import java.text.DecimalFormat;

public class NumberFormat {
    public static void main(String[] args) {
        nof(1076543278);
    }

    public static void nof(long no) {
        String s=String.valueOf(no);

        long li = s.length();

        if (li == 10) {
            String lf1 = "";
            String lf2 = "";
            String lf3 = "";
            for (int i = 0; i <= s.length(); i++) {
                lf1 = s.substring(0, 3);
                lf2 = s.substring(3, 6);
                lf3 = s.substring(6);

            }
            System.out.println(lf1 + "_" + lf2 + "_" + lf3);
        } else {
            System.out.println("error");
            System.out.println("the number you entered has less than ten digit");
        }
    }
}
