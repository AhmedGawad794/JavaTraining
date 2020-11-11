package chapter3;

import java.util.Scanner;

public class LogicalLoanQualifier
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
        if(currentSalary >= minRequiredSalary && currentYears >= minRequiredYears)
        {
            System.out.println("You are qualified for a loan");
        }
        else
        {
            System.out.println("You are not qualified for a loan");
        }
    }
}
