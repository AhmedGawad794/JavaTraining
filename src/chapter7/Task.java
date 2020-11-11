package chapter7;

import java.util.Scanner;

public class Task
{
    private static Scanner scanner = new Scanner(System.in);
    private static String dayArray[];
    public static void main(String[] args)
    {
        displayDay();
        scanner.close();
    }
    public static String[] getDaysArray()
    {
        dayArray = new String[7];
        dayArray[0] = "Monday";
        dayArray[1] = "Tuesday";
        dayArray[2] = "Wednesday";
        dayArray[3] = "Thursday";
        dayArray[4] = "Friday";
        dayArray[5] = "Saturday";
        dayArray[6] = "Sunday";
        return dayArray;
    }
    public static int getNumber()
    {
        System.out.println("Enter number from 1 to 7");
        return scanner.nextInt();
    }
    public static void displayDay()
    {
        getDaysArray();
        System.out.println(dayArray[getNumber()-1]);
    }
}
