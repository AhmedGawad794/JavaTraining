package chapter5;

import java.util.Scanner;

public class Task
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[])
    {
        double planFee = getPlanFee();
        double overageMinutes = getOverageMinutes();
        scanner.close();
        double overageCost = getOverageCost(overageMinutes);
        double taxes = getTaxes(planFee, overageCost);
        calculateAndPrintBill(planFee,overageCost,taxes);
    }

    public static double getPlanFee() 
    {
        System.out.println("Enter plan fee");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static int getOverageMinutes()
    {
        System.out.println("Enter overage minutes");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double getOverageCost(double overageMinutes)
    {
        return overageMinutes * .25;
    }
    public static double getTaxes(double planFee, double overageCost)
    {
        return ((planFee + overageCost) * 0.15);
    }
    public static void calculateAndPrintBill(double base, double overage, double tax)
    {
        double totalBill = base + overage + tax;
        System.out.println("phone bill statement");
        System.out.println("plan: " + base);
        System.out.println("overage: " + overage);
        System.out.println("tax: " + tax);
        System.out.println("total: " + totalBill);
    }

}
