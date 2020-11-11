package chapter4;

import java.util.Scanner;

public class AddNumbers
{
    public static void main(String[] arg)
    {
        boolean repeat = true;
        double firstNumber;
        double secondNumber;
        double result;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Enter first number");
            firstNumber =  scanner.nextDouble();
            System.out.println("Enter second number");
            secondNumber = scanner.nextDouble();
            result = firstNumber + secondNumber;
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + result);
            System.out.println("do you want to repeat again ?");
            repeat =  scanner.nextBoolean();
        }
        while (repeat);
        System.out.println("Thanks for using our app");
    }
}
