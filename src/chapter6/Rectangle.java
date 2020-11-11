package chapter6;

public class Rectangle
{

    // variables
    private double length;
    private double width;

    //properties
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }


    // constructors
    public Rectangle()
    {
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }
    public Rectangle(double length)
    {
        setLength(length);
        setWidth(length);
    }

    //methods

    public double calculatePremiere()
    {
        return ( 2 * ( length + width ));
    }
    public double calculateArea()
    {
        return length * width;
    }
    public void displayDimensions(double width, double length)
    {
        System.out.println("the length is: " + length);
        System.out.println("the width is: " + width);
    }

}
