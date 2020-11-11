package chapter4;

import java.util.Scanner;

public class Cashier
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items you would like to scan");
        int quantity = scanner.nextInt();

        double total = 0;
        int j=0;
        for (int i = 0; i < quantity; i++)
        {
            System.out.println("Enter price for item num " + ++j);
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Total price is " + total);

    }
}
