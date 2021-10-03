package Lab4Solution;

import java.util.Scanner;

public class PriceSale<Static> {
    private int bagsNumber;
    private int  weightPerbag;
    public static final double PRICEPERLB = 5.99;
    public static final double SALE_TAX = 0.0725;

    public PriceSale(int bagsNumber, int weightPerbag) {
        this.bagsNumber = bagsNumber;
        this.weightPerbag = weightPerbag;
    }

    public int getBagsNumber() {
        return bagsNumber;
    }

    public void setBagsNumber(int bagsNumber) {
        this.bagsNumber = bagsNumber;
    }

    public int getWeightPerbag() {
        return weightPerbag;
    }

    public void setWeightPerbag(int weightPerbag) {
        this.weightPerbag = weightPerbag;
    }

    public double getTotalprice() {
        return this.weightPerbag * this.bagsNumber * this.PRICEPERLB;
    }

    public double TotalPriceWithtax() {
        return this.getTotalprice() + (this.getTotalprice() * this.SALE_TAX);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input bag weight");
        int weightPerbag = input.nextInt();
        System.out.println("input the number of bags sold");
        int bagnumber = input.nextInt();
        PriceSale p1 = new PriceSale(bagnumber, weightPerbag);
        System.out.println("Number of bags sold:" + " " + bagnumber);
        System.out.println("Weight per bag:" + " " + weightPerbag+" "+"Lb");
        System.out.println("Price per pound:" + " " + "$"+" "+PRICEPERLB );
        System.out.println("Sales tax:" + "7.25%");
        String s = String.format("%.6g%n", p1.TotalPriceWithtax());
        System.out.println("The total price :" + "$" + " " + s);

    }
}
