package PastWork;

import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter prize: ");
        double prize = sc.nextDouble();

        double tax = prize * 10 / 100;
        double prizeWithTax = prize + tax;

        System.out.println("Total no of person ");
        int personNo = ab.nextInt();

        double individualPaymentAmt = prizeWithTax / personNo;

        System.out.println("Tax Amount is "+tax);
        System.out.println("Total "+prizeWithTax);
        System.out.println("Each person have to pay: "+individualPaymentAmt);


    }
}
