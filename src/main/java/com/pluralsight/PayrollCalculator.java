package com.pluralsight;
import java.util.*;
public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hours = myScanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float pay_rate = myScanner.nextFloat();
        float gross_pay = (pay_rate*hours);

        System.out.print(gross_pay);
    }

}