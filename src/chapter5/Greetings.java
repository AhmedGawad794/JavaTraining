package chapter5;

import java.util.Scanner;

public class Greetings
{


    public static void main(String args[])
    {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        name(userName);
    }
    public static void name(String _name)
    {
        System.out.println("welcome " + _name);
    }

}
