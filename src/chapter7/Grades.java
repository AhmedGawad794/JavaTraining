package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of grades");
        Scanner scanner = new Scanner(System.in);
        int numOfGrades = scanner.nextInt();
        int[] gradesArray = new int[numOfGrades];
        for (int i = 0; i <gradesArray.length; i++)
        {
            System.out.println("Enter grade number " + (i+1));
            gradesArray[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(gradesArray);
        int minGrade = gradesArray[0];
        int maxGrade = gradesArray[numOfGrades-1];
        int totalGrades = 0;
        for (int i = 0; i < gradesArray.length; i++)
        {
            totalGrades = totalGrades + gradesArray[i];
        }
        double avgScore = totalGrades / gradesArray.length;
        System.out.println("your avg grade is: " + avgScore);
        System.out.println("your maximum grade is: " + maxGrade);
        System.out.println("your minimum grade us: " + minGrade);
    }
}
