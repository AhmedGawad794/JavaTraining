package chapter8;

import java.awt.desktop.SystemEventListener;

public class TextProcessor
{
    public static void main(String[] args)
    {
        countWords(" I Love test automation university ");

    }
    public static void countWords(String text)
    {
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = ("your string contains " + numberOfWords + " words");
        System.out.println(message);
    }
}
