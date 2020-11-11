package chapter3;

import java.util.Scanner;

public class LoanQualifier
{

    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int minRequiredSalary = 30000;
        int minRequiredYears = 2;
        boolean qualified;
        System.out.println("Enter your annual salary ");
        double currentSalary = scanner.nextDouble();
        System.out.println("How many years you have been working for your current employer ?");
        double currentYears = scanner.nextDouble();
        scanner.close();
        if (currentSalary >= minRequiredSalary)
        {
            if (currentYears >= minRequiredYears)
            {
               qualified = true;
            }
            else
            {
                qualified = false;
            }
        }
        else
        {
            qualified = false;
        }
        if (qualified = true)
        {
            System.out.println("You are qualified for the loan");
        }
        else
        {
            System.out.println("you are nit qualified for a loan");
        }
    }
}
