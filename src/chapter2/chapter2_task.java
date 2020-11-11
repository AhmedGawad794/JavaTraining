package chapter2;
import java.util.Scanner;

public class chapter2_task
{
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert season of the year");
        String season = scanner.next();
        System.out.println("Insert an integer number");
        int num = scanner.nextInt();
        System.out.println("Insert an Adjective");
        String adj = scanner.next();

        System.out.println("On a " + adj + " " +  season + " day, I drink a minimum of " + num + " cups of coffee.");
    }


}
