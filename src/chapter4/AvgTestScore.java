package chapter4;

import java.util.Scanner;

public class AvgTestScore
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = 24;
        int numOfTest = 4;

        for (int i = 0; i < numOfStudents; i++)
        {
            double total = 0;
            for (int j = 0; j < numOfTest; j++)
            {
                System.out.println("Enter the score of test # " + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numOfTest;
            System.out.println("the test average for student # " + (i+1) + " is " + average);
        }
        scanner.close();
    }
}
