
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        int lowerTaxlimit;
        int minimumTaxValue;
        double percentageRate;
        if(giftValue < 5000) {
            System.out.println("No tax!");
        } else if ((giftValue >= 5000) && (giftValue <=25000)) {
            lowerTaxlimit = 100;
            minimumTaxValue = 5000;
            percentageRate = 0.08;
            double ltl = (double)lowerTaxlimit;
            double gmp = (giftValue - minimumTaxValue)*percentageRate;
            double tax = ltl + gmp;
            System.out.println("Tax: "+ tax);
        } else if ((giftValue >= 25000) && (giftValue <=55000)) {
            lowerTaxlimit = 1700;
            minimumTaxValue = 25000;
            percentageRate = 0.10;
            double ltl = (double)lowerTaxlimit;
            double gmp = (giftValue - minimumTaxValue)*percentageRate;
            double tax = ltl + gmp;
            System.out.println("Tax: "+ tax);
        } else if ((giftValue >= 55000) && (giftValue <=200000)) {
            lowerTaxlimit = 4700;
            minimumTaxValue = 55000;
            percentageRate = 0.12;
            double ltl = (double)lowerTaxlimit;
            double gmp = (giftValue - minimumTaxValue)*percentageRate;
            double tax = ltl + gmp;
            System.out.println("Tax: "+ tax);
        } else if ((giftValue >= 200000) && (giftValue <=1000000)) {
            lowerTaxlimit = 22100;
            minimumTaxValue = 200000;
            percentageRate = 0.15;
            double ltl = (double)lowerTaxlimit;
            double gmp = (giftValue - minimumTaxValue)*percentageRate;
            double tax = ltl + gmp;
            System.out.println("Tax: "+ tax);
        } else if (giftValue >=1000000) {
            lowerTaxlimit = 142100;
            minimumTaxValue = 1000000;
            percentageRate = 0.17;
            double ltl = (double)lowerTaxlimit;
            double gmp = (giftValue - minimumTaxValue)*percentageRate;
            double tax = ltl + gmp;
            System.out.println("Tax: "+ tax);
        }
    }
}
