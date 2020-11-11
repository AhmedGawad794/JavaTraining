package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicketUpdated
{
    private static final int LENGTH = 6;
    private static final int MAXIMUM_TICKET_NUMBER = 69;
    public static void main(String args[])
    {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers()
    {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++)
        {
            int randomNumber;
            do
            {
                randomNumber = random.nextInt(MAXIMUM_TICKET_NUMBER) + 1;
            }
            while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static void printTicket(int[] ticket)
    {
        for (int i = 0; i < LENGTH; i++)
        {
            System.out.print(ticket[i] + " ");
        }
    }
    public static Boolean search(int[] array, int numberToSearchFor)
    {
        for(int value : array)
        {
            if (value == numberToSearchFor)
            {
                return true;
            }

        }
        return false;
    }
    public static Boolean binarySearch(int[] array, int numberToSearchFor)
    {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
