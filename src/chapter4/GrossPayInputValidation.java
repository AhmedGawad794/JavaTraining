package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation
{
    public static void main(String[] arg)
    {
        int maxHours = 40;
        int rate = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter working hours this week");
        int hours = scanner.nextInt();
        while (hours > maxHours)
        {
            System.out.println("Invalid value! Maximum allowed hours is 40");
            System.out.println("Enter working hours this week");
            hours = scanner.nextInt();
        }
        scanner.close();
        int salary = rate * hours;
        System.out.println("Your salary for this week is " + salary + "$");
    }
}
