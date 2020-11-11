package chapter5;

import java.util.Scanner;

public class InstantCreditCheck
{

    /* write an instant credit check to approve anyone who makes more than 25000$ and has credit score of 700 or more
    and reject all others
     */

    static int requiredSalary = 25000;
    static int requiredScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[])
    {
        double salary = getSalary();
        double score = getScore();
        scanner.close();

        // 3. check if user is qualified
        Boolean qualified = isUserQualified(score, salary);
        // 4. results
        notifyUser(qualified);
    }

    private static Boolean isUserQualified(double score, double salary)
    {
        if (score >= requiredScore && salary >= requiredSalary)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static double getSalary()
    {
        System.out.println("Enter your annual salary");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static double getScore()
    {
        System.out.println("Enter your credit score");
        double score = scanner.nextDouble();
        return score;
    }
    public static void notifyUser(Boolean isQualified)
    {
        if (isQualified)
        {
            System.out.println("Congrats! you have been approved");
        }
        else
        {
            System.out.println("You are not qualified");
        }
    }

}
