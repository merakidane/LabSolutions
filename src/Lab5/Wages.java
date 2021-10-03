package Lab5;

import java.util.Scanner;

public class Wages {
    private double hours;
    private double salestotal;

    public static final double HOURLY_WAGE = 7.25;

    public static void main(String[] args) {
        double total_hoursw;
        double hours;
        double sales_total = 0.0;
        double commission;
        double overTime;
        Scanner input = new Scanner(System.in);
        System.out.println("input the hours you worked");
        hours = input.nextDouble();
        System.out.println("input the total sales");
        sales_total=input.nextDouble();
        if (hours <= 40) {
            total_hoursw = hours * HOURLY_WAGE;
            if ((sales_total >= 1) && (sales_total <= 99.9)) {
                commission = 0.05 * sales_total;
                total_hoursw += commission;
            } else if ((sales_total >= 100) && (sales_total <= 299.99)) {
                commission = 0.1 * sales_total;
                total_hoursw += commission;
            } else {
                commission = 0.15 * sales_total;
                total_hoursw += commission;
            }
            System.out.printf(" total wage" + total_hoursw);


        } else {

            overTime = hours - 40;
            total_hoursw = (40 * HOURLY_WAGE) + overTime * (HOURLY_WAGE + (HOURLY_WAGE * 0.5));
            if ((sales_total >= 1) && (sales_total <= 99.9)) {
                commission = 0.05 * sales_total;
                total_hoursw += commission;
            } else if ((sales_total >= 100) && (sales_total <= 299.99)) {
                commission = 0.10 * sales_total;
                total_hoursw += commission;
            } else {
                commission = 0.15 * sales_total;
                total_hoursw += commission;
            }
            System.out.println("the total wage" + total_hoursw);
        }

    }


}

