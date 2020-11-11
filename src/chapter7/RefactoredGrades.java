package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class RefactoredGrades
{
    private static int gradesArray[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the number of grades");
        gradesArray = new int[scanner.nextInt()];
        getGrades();
        showResults();
    }
    public static void getGrades()
    {
        for (int i = 0; i <gradesArray.length; i++)
        {
            System.out.println("Enter grade number " + (i+1));
            gradesArray[i] = scanner.nextInt();
        }
    }
    public static int calculateSum()
    {
        int sum=0;
        for(int value: gradesArray)
        {
            sum = sum + value;
        }
        return sum;
    }
    public static double calculateAverageScore()
    {
        return calculateSum()/ gradesArray.length;
    }
    public static void showResults()
    {
        Arrays.sort(gradesArray);
        System.out.println("Average: " + String.format("%.2f", calculateAverageScore()));
        System.out.println("Maximum: " + gradesArray[gradesArray.length-1]);
        System.out.println("Minimum: " + gradesArray[0]);

    }
}
