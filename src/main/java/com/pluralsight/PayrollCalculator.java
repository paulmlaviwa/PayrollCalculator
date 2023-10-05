package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        float hrs_worked = myScanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float pay_rate = myScanner.nextFloat();

        System.out.print(name + "'s gross pay is " + hrs_worked + " * " + pay_rate + " = " + pay_rate*hrs_worked);

    }
}
