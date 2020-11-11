package chapter3;

import java.util.Scanner;
public class ChapterTask
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pennies");
        int pennies = scanner.nextInt();
        System.out.println("Enter nickles");
        int nickels = scanner.nextInt();
        System.out.println("Enter dimes");
        int dimes = scanner.nextInt();
        System.out.println("Enter quarters");
        int quarters = scanner.nextInt();
        double result = (pennies * .01) + (nickels * 0.05) + (dimes * 0.1) + (quarters * 0.25);
        if (result == 1)
        {
            System.out.println("Congratulations! you win");
        }
        else if( result > 1)
        {
            System.out.println("you are over by " + (result-1));
        }
        else
        {
            System.out.println("you are under by " + (1-result));
        }

    }


}
