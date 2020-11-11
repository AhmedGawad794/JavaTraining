package chapter9;

public class InheritanceTester
{
    public static void main(String[] args)
    {
        Mother mom = new Mother();
        mom.setName("Afaf");
        System.out.println(mom.getName() + " " +  mom.getGender());

    }
    public static void testSquareOverride()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(6);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setSides(4);
        System.out.println(square.calculatePerimeter());
    }
}
