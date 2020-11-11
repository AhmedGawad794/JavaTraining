package chapter3;

import java.util.Scanner;

public class SalaryCalculator
{
    public static void main(String arg[])
    {
        // 1. information we know
        double salary = 1000;
        int bonus = 250;
        int target = 10;
        // 2. Get what we don't know
        System.out.println("Enter number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // 3. Precess data
        if (sales >= target)
        {
            salary = salary + bonus;
        }
        // 4. Display results
        System.out.println("Your salary this week is " + salary + "$");
    }
}
