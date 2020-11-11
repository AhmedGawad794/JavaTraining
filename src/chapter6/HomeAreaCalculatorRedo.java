package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo
{
    public static void main(String args[])
    {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double totalArea = calculator.calculateTotalArea(kitchen, bathroom);
    }
    public Rectangle getRoom()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();
        scanner.close();
        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2)
    {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
