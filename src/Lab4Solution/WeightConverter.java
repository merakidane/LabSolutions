package Lab4Solution;
import java.util.Scanner;
public class WeightConverter {
    private double earth_weight;
    public static final double MOON_WEIGHT = 0.167;

    public WeightConverter(double earth_weight) {
        this.earth_weight = earth_weight;

    }

    public double getEarth_weight() {
        return earth_weight;
    }

    public void setEarth_weight(double earth_weight) {
        this.earth_weight = earth_weight;
    }

    public Double getMoonw() {
        return this.earth_weight * MOON_WEIGHT;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input your earth weight");
        double earthweight= input.nextDouble();
        WeightConverter moon = new WeightConverter(earthweight);

        System.out.println(moon.getMoonw());
    }


}
