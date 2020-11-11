package chapter2;

import java.util.Scanner;

public class GrossPayCalculator
{
    public static void main(String arg[])
    {
        // 1. Get the numbers of hours worked
            System.out.println("Enter number of hours worked this week");
            Scanner scanner = new Scanner(System.in);
            double workHours = scanner.nextDouble();
        // 2. Get the hourly pay rate
            System.out.println("Enter hour pay rate");
            double payRate = scanner.nextDouble();
        // 3. Multiply hours and pay rate
            double grossSalary = workHours * payRate;

        // 4. Results
            System.out.println("You have worked " + workHours + " this week");
            System.out.println("Your pay rate is " + payRate + "$");
            System.out.println("Your gross salary this week is " + grossSalary + "$");
    }
}
