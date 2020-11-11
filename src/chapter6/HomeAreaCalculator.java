package chapter6;

public class HomeAreaCalculator
{
    public static void main(String args[])
    {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(7);
        rectangle1.setLength(8);
        double rec1Area = rectangle1.calculateArea();
        double rec1Premiere = rectangle1.calculatePremiere();
        Rectangle rectangle2 = new Rectangle(4,5);
        double rec2Area = rectangle2.calculateArea();
        double rec2Premiere = rectangle2.calculatePremiere();
        Rectangle rectangle3 = new Rectangle(5);
        double rec3Area = rectangle3.calculatePremiere();
        double rec3Premiere = rectangle3.calculateArea();
    }
}
