package chapter10;

public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("cat sound");
    }
    public void scratch()
    {
        System.out.println("cats love scratching things");
    }
}
