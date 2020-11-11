package chapter3;

import java.util.Scanner;

public class GradeMessage
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade");
        String grade = scanner.next();
        String message;
        switch (grade)
        {
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "c":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "You didn't make it";
                break;
            default:
                message = "Invalid score value";
        }
    }
}
